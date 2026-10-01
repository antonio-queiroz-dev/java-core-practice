# Guia Completo: SQL (PostgreSQL)

## O que é SQL?

É a linguagem para conversar com um banco de dados relacional. Você **descreve o resultado que quer** e o banco decide como buscar.

Você já viu essa filosofia: é exatamente a mesma dos Streams. Quando você escreve

```java
animes.stream()
    .filter(a -> a.getNota() > 8.5)
    .map(Anime::getTitulo)
    .sorted()
    .toList();
```

você não diz "percorra o array, compare, adicione numa lista". Você diz o **quê**. SQL é isso, só que os dados estão em disco e quem executa é o banco.

A correspondência é quase palavra por palavra:

| Stream | SQL |
|--------|-----|
| `.stream()` sobre uma coleção | `FROM tabela` |
| `.filter(...)` | `WHERE condição` |
| `.map(...)` | lista de colunas do `SELECT` |
| `.sorted(...)` | `ORDER BY` |
| `.distinct()` | `SELECT DISTINCT` |
| `.limit(n)` / `.skip(n)` | `LIMIT n` / `OFFSET n` |
| `.count()` | `COUNT(*)` |
| `Collectors.groupingBy(...)` | `GROUP BY` |
| `Collectors.counting()` | `COUNT(*)` com `GROUP BY` |

---

## A tabela dos exercícios

Todos os exercícios da fase usam esta tabela. Se precisar recriar o ambiente:

```sql
CREATE TABLE animes (
    id        SERIAL PRIMARY KEY,
    titulo    VARCHAR(100) NOT NULL,
    genero    VARCHAR(50),
    episodios INTEGER,
    nota      NUMERIC(3,1)
);

INSERT INTO animes (titulo, genero, episodios, nota) VALUES
    ('Fullmetal Alchemist', 'Ação',      64,  9.2),
    ('Death Note',          'Suspense',  37,  9.0),
    ('One Punch Man',       'Ação',      12,  8.7),
    ('Steins;Gate',         'Suspense',  24,  9.1),
    ('Naruto',              'Ação',     220,  8.3),
    ('Your Lie in April',   'Drama',     22,  8.6),
    ('Clannad',             'Drama',     47,  8.9),
    ('Bleach',              'Ação',     366,  8.2);
```

**Por que `NUMERIC(3,1)` e não `FLOAT`?** Guarde isso, você vai precisar mais adiante no `ROUND`. `NUMERIC` é decimal exato — é o tipo certo para nota, preço, dinheiro. `FLOAT`/`REAL` é aproximado.

---

## A estrutura: sempre a mesma ordem

```sql
SELECT   colunas          -- 5. o que mostrar
FROM     tabela           -- 1. de onde vem
WHERE    condição         -- 2. quais linhas manter
GROUP BY coluna           -- 3. como agrupar
HAVING   condição         -- 4. quais grupos manter
ORDER BY coluna           -- 6. como ordenar
LIMIT    n;               -- 7. quantas linhas
```

A ordem em que você **escreve** é fixa (trocar dá erro de sintaxe). Mas repare nos números do comentário: a ordem em que o banco **executa** é outra. Isso explica quase todos os erros de iniciante, e vamos voltar nisso no fim do guia.

Toda query termina com `;`.

---

## `SELECT` — escolher colunas

É o `.map()` do SQL: define o formato de cada linha do resultado.

```sql
-- Todas as colunas
SELECT * FROM animes;

-- Só as que interessam
SELECT titulo, nota FROM animes;

-- Expressões também valem
SELECT titulo, nota * 10 FROM animes;
SELECT titulo, episodios / 2 FROM animes;
```

### Alias com `AS` — dar nome à coluna

Sem alias, uma coluna calculada vem com nome feio (`?column?`, `avg`, `round`). Com alias, ela vem legível:

```sql
SELECT AVG(nota) AS nota_media FROM animes;
```

O `AS` é opcional (`AVG(nota) nota_media` funciona), mas escreva ele — deixa a intenção explícita.

**Atenção com aspas:** em PostgreSQL, `'texto'` é uma string e `"texto"` é o nome de uma coluna. Trocar os dois é o erro mais comum de quem vem de outra linguagem:

```sql
SELECT * FROM animes WHERE genero = 'Ação';   -- CERTO
SELECT * FROM animes WHERE genero = "Ação";   -- ERRO: column "Ação" does not exist
```

### `DISTINCT` — remover duplicatas

```sql
SELECT DISTINCT genero FROM animes;
-- Ação, Suspense, Drama
```

É o `.distinct()` do Stream. Aplica-se ao conjunto de colunas do `SELECT`, não a uma coluna só.

---

## `WHERE` — filtrar linhas

É o `.filter()`. Roda **antes** de agrupar e antes de montar o `SELECT`.

### Operadores de comparação

| Operador | Significado |
|----------|-------------|
| `=` | igual (um `=` só, não `==`) |
| `<>` ou `!=` | diferente |
| `>` `<` `>=` `<=` | maior, menor, maior ou igual, menor ou igual |

```sql
SELECT titulo, nota FROM animes WHERE nota > 8.5;
SELECT titulo FROM animes WHERE genero <> 'Ação';
```

### `AND`, `OR` e o perigo da precedência

`AND` tem precedência maior que `OR` — igual ao Java, onde `&&` vem antes de `||`.

```sql
-- Ação COM mais de 30 episódios
SELECT titulo, episodios FROM animes
WHERE genero = 'Ação' AND episodios > 30;

-- Suspense OU nota alta (qualquer gênero)
SELECT titulo, nota FROM animes
WHERE genero = 'Suspense' OR nota >= 9.0;
```

Agora o detalhe que derruba muita gente:

```sql
-- Provavelmente NÃO é o que você quis dizer:
WHERE genero = 'Ação' OR genero = 'Drama' AND nota > 9.0
-- lido pelo banco como: genero = 'Ação' OR (genero = 'Drama' AND nota > 9.0)
-- resultado: TODOS os de Ação entram, mesmo com nota baixa

-- Com parênteses, a intenção fica explícita:
WHERE (genero = 'Ação' OR genero = 'Drama') AND nota > 9.0
```

**Regra:** misturou `AND` com `OR` na mesma query? Ponha parênteses. Sempre.

### `BETWEEN`, `IN`, `LIKE`, `IS NULL`

```sql
-- BETWEEN: inclui os dois extremos
SELECT titulo FROM animes WHERE nota BETWEEN 8.5 AND 9.0;
-- equivale a: nota >= 8.5 AND nota <= 9.0

-- IN: substitui vários OR
SELECT titulo FROM animes WHERE genero IN ('Ação', 'Drama');
-- equivale a: genero = 'Ação' OR genero = 'Drama'

-- LIKE: busca por padrão de texto
--   %  = qualquer sequência de caracteres
--   _  = exatamente um caractere
SELECT titulo FROM animes WHERE titulo LIKE 'One%';    -- começa com "One"
SELECT titulo FROM animes WHERE titulo LIKE '%Note';   -- termina com "Note"
SELECT titulo FROM animes WHERE titulo LIKE '%man%';   -- contém "man"

-- ILIKE: igual ao LIKE, mas ignora maiúsculas/minúsculas (exclusivo do PostgreSQL)
SELECT titulo FROM animes WHERE titulo ILIKE '%MAN%';  -- acha "One Punch Man"
```

`LIKE` é case-sensitive no PostgreSQL. Na prática, para busca por texto digitado por usuário você quase sempre quer `ILIKE`.

### `NULL` — o valor que não é valor

`NULL` significa "desconhecido". Ele não é igual a nada, **nem a si mesmo**:

```sql
WHERE nota = NULL      -- nunca retorna nada, nem para linhas com nota nula
WHERE nota IS NULL     -- CERTO
WHERE nota IS NOT NULL -- CERTO
```

E cuidado: `NULL` também escapa das negações.

```sql
-- Se algum anime tiver genero NULL, ele NÃO aparece aqui:
SELECT titulo FROM animes WHERE genero <> 'Ação';

-- Para incluí-lo:
SELECT titulo FROM animes WHERE genero <> 'Ação' OR genero IS NULL;
```

`COALESCE` troca `NULL` por um valor padrão — é o `getOrDefault` do SQL:

```sql
SELECT titulo, COALESCE(nota, 0) AS nota FROM animes;
```

---

## `ORDER BY` — ordenar

É o `.sorted()`. Sempre roda no fim, depois de tudo já ter sido filtrado e agrupado.

```sql
-- ASC (crescente) é o padrão e pode ser omitido
SELECT titulo, nota FROM animes ORDER BY nota;
SELECT titulo, nota FROM animes ORDER BY nota DESC;

-- Múltiplos critérios: desempata da esquerda para a direita
SELECT titulo, genero, nota FROM animes
ORDER BY genero ASC, nota DESC;
-- agrupa visualmente por gênero; dentro de cada gênero, melhor nota primeiro
```

Isso é o equivalente de `Comparator.comparing(...).thenComparing(...)`.

Você pode ordenar por um alias definido no `SELECT` — o `ORDER BY` executa depois dele:

```sql
SELECT genero, COUNT(*) AS quantidade
FROM animes
GROUP BY genero
ORDER BY quantidade DESC;   -- usa o alias, funciona
```

`NULL` fica por último no `ASC` e primeiro no `DESC`. Para controlar: `ORDER BY nota DESC NULLS LAST`.

---

## `LIMIT` e `OFFSET` — recortar

```sql
-- Top 3 melhores notas
SELECT titulo, nota FROM animes ORDER BY nota DESC LIMIT 3;

-- Pular os 3 primeiros e pegar os 3 seguintes (paginação)
SELECT titulo, nota FROM animes ORDER BY nota DESC LIMIT 3 OFFSET 3;
```

São o `.limit()` e o `.skip()` do Stream — e é literalmente o que o `Pageable` do Spring Data gera por baixo.

**Regra:** `LIMIT` sem `ORDER BY` não tem resultado garantido. Sem ordenação explícita, o banco pode devolver as linhas em qualquer ordem, e "os 3 primeiros" vira loteria.

---

## Funções de agregação — o `reduce` do SQL

Elas pegam **muitas linhas e devolvem um valor só**.

| Função | O que faz | Equivalente em Stream |
|--------|-----------|------------------------|
| `COUNT(*)` | conta linhas | `.count()` |
| `SUM(coluna)` | soma | `.mapToInt(...).sum()` |
| `AVG(coluna)` | média | `.average()` |
| `MAX(coluna)` | maior valor | `.max()` |
| `MIN(coluna)` | menor valor | `.min()` |

```sql
-- Quantos animes têm nota >= 9.0?
SELECT COUNT(*) FROM animes WHERE nota >= 9.0;

-- Várias agregações de uma vez
SELECT AVG(nota) AS nota_media,
       MAX(nota) AS maior_nota,
       MIN(nota) AS menor_nota
FROM animes;
```

Repare: sem `GROUP BY`, a agregação trata a tabela inteira como **um único grupo** e devolve exatamente uma linha.

### `COUNT(*)` vs `COUNT(coluna)`

```sql
SELECT COUNT(*)      FROM animes;   -- conta todas as linhas
SELECT COUNT(nota)   FROM animes;   -- conta só as linhas com nota NÃO nula
SELECT COUNT(DISTINCT genero) FROM animes;  -- conta gêneros diferentes
```

Todas as agregações (menos `COUNT(*)`) **ignoram `NULL`**. Isso importa em `AVG`: a média de `[9.0, NULL, 8.0]` é `8.5`, não `5.67`. O `NULL` não entra nem no numerador nem no denominador.

### `ROUND` — e a pegadinha do PostgreSQL

```sql
SELECT ROUND(AVG(nota), 1) AS media FROM animes;
```

Isso funciona porque `nota` é `NUMERIC`. Se a coluna fosse `REAL` ou `DOUBLE PRECISION`, você levaria este erro:

```
ERROR: function round(double precision, integer) does not exist
```

O PostgreSQL só tem `ROUND(numeric, casas)` — a versão de dois argumentos não aceita ponto flutuante. A correção é converter:

```sql
SELECT ROUND(AVG(nota)::numeric, 1) AS media FROM animes;
```

O `::tipo` é o cast do PostgreSQL. Guarde esse `::numeric`, você vai reencontrá-lo.

### Divisão inteira

```sql
SELECT 7 / 2;              -- 3   (int / int = int, trunca)
SELECT 7.0 / 2;            -- 3.5
SELECT 7::numeric / 2;     -- 3.5
```

Mesma armadilha do Java, mesma solução: converta um dos lados antes de dividir.

---

## `GROUP BY` — o `Collectors.groupingBy`

Aqui a fase engrena de verdade. `GROUP BY` junta as linhas que têm o mesmo valor numa coluna e aplica a agregação **por grupo**.

```sql
-- Quantos animes por gênero?
SELECT genero, COUNT(*) AS quantidade
FROM animes
GROUP BY genero
ORDER BY quantidade DESC;
```

Resultado:

| genero | quantidade |
|--------|-----------|
| Ação | 4 |
| Suspense | 2 |
| Drama | 2 |

Compare com o que você já escreveu em Java:

```java
// Com HashMap (fase d):
HashMap<String, Integer> contagem = new HashMap<>();
for (Anime a : animes) {
    contagem.merge(a.getGenero(), 1, Integer::sum);
}

// Com Streams (fase e):
Map<String, Long> contagem = animes.stream()
    .collect(Collectors.groupingBy(Anime::getGenero, Collectors.counting()));

// Com SQL:
SELECT genero, COUNT(*) FROM animes GROUP BY genero;
```

Três fases, o mesmo padrão. `groupingBy` = `GROUP BY`, `counting()` = `COUNT(*)`.

E o `groupingBy` com downstream diferente de `counting` também tem par direto:

```sql
-- média por grupo  →  groupingBy(..., averagingDouble(...))
SELECT genero, ROUND(AVG(nota), 1) AS media
FROM animes
GROUP BY genero
ORDER BY media DESC;

-- máximo por grupo  →  groupingBy(..., maxBy(...))
SELECT genero, MAX(nota) AS melhor_nota
FROM animes
GROUP BY genero;
```

### A regra de ouro do `GROUP BY`

**Toda coluna do `SELECT` precisa estar no `GROUP BY` ou dentro de uma função de agregação.** Sem exceção.

```sql
-- ERRO: column "titulo" must appear in the GROUP BY clause
SELECT genero, titulo, COUNT(*) FROM animes GROUP BY genero;
```

O motivo é lógico, não burocrático: o grupo `'Ação'` tem 4 títulos diferentes. Qual deles o banco deveria imprimir na linha do grupo? Não existe resposta, então ele recusa.

Se você quer o título junto, a pergunta muda ("qual o melhor anime de cada gênero?") e a solução também — é subquery ou window function, não `GROUP BY` puro.

### Agrupar por mais de uma coluna

```sql
SELECT genero, (nota >= 9.0) AS destaque, COUNT(*)
FROM animes
GROUP BY genero, destaque;
```

Cada combinação distinta de `(genero, destaque)` vira um grupo.

---

## `HAVING` — filtrar grupos

`WHERE` filtra **linhas**, antes de agrupar. `HAVING` filtra **grupos**, depois de agrupar. Essa é a única diferença, e ela é toda a diferença.

```sql
-- Só os gêneros que têm mais de 2 animes
SELECT genero, COUNT(*) AS quantidade
FROM animes
GROUP BY genero
HAVING COUNT(*) > 2;
```

Por que não dá pra usar `WHERE COUNT(*) > 2`? Porque quando o `WHERE` roda, os grupos ainda não existem — não há o que contar. O erro é literal:

```
ERROR: aggregate functions are not allowed in WHERE
```

Os dois juntos, cada um no seu papel:

```sql
-- Entre os animes com nota >= 8.5 (WHERE, linha a linha),
-- mostre os gêneros que têm pelo menos 2 deles (HAVING, grupo a grupo)
SELECT genero, COUNT(*) AS quantidade
FROM animes
WHERE nota >= 8.5
GROUP BY genero
HAVING COUNT(*) >= 2
ORDER BY quantidade DESC;
```

Em Stream, isso seria filtrar antes do `collect` (`WHERE`) e depois filtrar o mapa resultante (`HAVING`).

---

## `CASE WHEN` — o ternário do SQL

Você já usou o ternário dentro do `groupingBy` nos exercícios de Stream. O equivalente em SQL é o `CASE`:

```java
// Java
.collect(Collectors.groupingBy(a -> a.getNota() >= 9.0 ? "Excelente" : "Bom",
                               Collectors.counting()));
```

```sql
-- SQL
SELECT CASE WHEN nota >= 9.0 THEN 'Excelente' ELSE 'Bom' END AS faixa,
       COUNT(*) AS quantidade
FROM animes
GROUP BY faixa;
```

Com mais de duas faixas, encadeie os `WHEN` — ele para no primeiro que der verdadeiro:

```sql
SELECT titulo,
       CASE
           WHEN nota >= 9.0 THEN 'Excelente'
           WHEN nota >= 8.5 THEN 'Bom'
           ELSE 'Regular'
       END AS faixa
FROM animes;
```

Sem `ELSE`, o resultado é `NULL` quando nenhum `WHEN` bate.

---

## A ordem de execução (o que explica os erros estranhos)

Você escreve nesta ordem:

```
SELECT → FROM → WHERE → GROUP BY → HAVING → ORDER BY → LIMIT
```

O banco executa nesta:

```
FROM → WHERE → GROUP BY → HAVING → SELECT → ORDER BY → LIMIT
```

O `SELECT` é quase o último. Daí saem duas consequências que valem mais que qualquer decoreba:

**1. Alias do `SELECT` não funciona no `WHERE`** — quando o `WHERE` roda, o alias ainda não existe:

```sql
-- ERRO: column "media" does not exist
SELECT AVG(nota) AS media FROM animes WHERE media > 8;

-- CERTO (é filtro de grupo, então é HAVING com a expressão inteira):
SELECT genero, AVG(nota) AS media FROM animes GROUP BY genero HAVING AVG(nota) > 8;
```

**2. Alias do `SELECT` funciona no `ORDER BY`** — esse roda depois:

```sql
SELECT genero, COUNT(*) AS quantidade
FROM animes GROUP BY genero
ORDER BY quantidade DESC;   -- OK
```

Se você entender essa ordem, para de decorar em que cláusula cada coisa pode aparecer — passa a deduzir.

---

## Próximo passo: `JOIN`

Até aqui tudo veio de uma tabela só. Bancos reais espalham os dados em várias, e `JOIN` é como você as reúne. Uma prévia, para você saber o que vem:

```sql
CREATE TABLE estudios (
    id   SERIAL PRIMARY KEY,
    nome VARCHAR(100)
);
-- e animes ganharia uma coluna estudio_id REFERENCES estudios(id)

-- INNER JOIN: só as linhas que casam dos dois lados
SELECT a.titulo, e.nome AS estudio
FROM animes a
INNER JOIN estudios e ON a.estudio_id = e.id;

-- LEFT JOIN: todas as linhas da esquerda; sem par, as colunas da direita vêm NULL
SELECT a.titulo, e.nome AS estudio
FROM animes a
LEFT JOIN estudios e ON a.estudio_id = e.id;
```

O `a` e o `e` são aliases de tabela — encurtam a escrita e evitam ambiguidade quando as duas tabelas têm colunas de mesmo nome.

**Como escolher:** `INNER` quando você só quer o que tem correspondência; `LEFT` quando você quer tudo da tabela principal, tendo par ou não (ex.: "todos os animes, com o estúdio quando houver").

---

## Erros comuns

### 1. Aspas duplas em texto

```sql
WHERE genero = "Ação"   -- ERRO: column "Ação" does not exist
WHERE genero = 'Ação'   -- CERTO
```

### 2. Coluna solta no `SELECT` com `GROUP BY`

```sql
SELECT genero, titulo, COUNT(*) FROM animes GROUP BY genero;   -- ERRO
```

Toda coluna não agregada precisa estar no `GROUP BY`.

### 3. Agregação no `WHERE`

```sql
WHERE COUNT(*) > 2    -- ERRO: aggregate functions are not allowed in WHERE
HAVING COUNT(*) > 2   -- CERTO
```

### 4. Comparar com `NULL` usando `=`

```sql
WHERE nota = NULL     -- não retorna nada, jamais
WHERE nota IS NULL    -- CERTO
```

### 5. `ROUND` em ponto flutuante

```sql
ROUND(AVG(nota), 1)             -- ERRO se a coluna for REAL/DOUBLE PRECISION
ROUND(AVG(nota)::numeric, 1)    -- CERTO em qualquer caso
```

### 6. `LIMIT` sem `ORDER BY`

```sql
SELECT titulo FROM animes LIMIT 3;                    -- 3 linhas quaisquer
SELECT titulo FROM animes ORDER BY nota DESC LIMIT 3; -- os 3 melhores
```

### 7. `AND` e `OR` sem parênteses

```sql
WHERE genero = 'Ação' OR genero = 'Drama' AND nota > 9.0     -- AND vence, não é o que você quis
WHERE (genero = 'Ação' OR genero = 'Drama') AND nota > 9.0   -- explícito
```

### 8. `UPDATE`/`DELETE` sem `WHERE`

```sql
DELETE FROM animes;              -- apaga a tabela inteira, sem confirmação
DELETE FROM animes WHERE id = 5; -- CERTO
```

Não tem `Ctrl+Z`. Antes de rodar um `DELETE` ou `UPDATE`, troque o começo por `SELECT *` e confira quais linhas o `WHERE` pega.

---

## Conexão com o que você já sabe

- **Streams:** `filter` → `WHERE`, `map` → colunas do `SELECT`, `sorted` → `ORDER BY`, `groupingBy` → `GROUP BY`, `counting` → `COUNT(*)`, `limit`/`skip` → `LIMIT`/`OFFSET`. A fase `e_streams` foi treino para esta.
- **HashMap:** `COALESCE(coluna, 0)` é o `getOrDefault(chave, 0)`. `GROUP BY` + `COUNT(*)` é o `merge(chave, 1, Integer::sum)`.
- **Ternário:** `CASE WHEN ... THEN ... ELSE ... END` é o `cond ? a : b` que você usou dentro do `groupingBy`.
- **Spring Data:** `findByNotaGreaterThan(8.5)` gera `WHERE nota > 8.5`. Entender SQL é entender o que o Spring escreve por você — e por que às vezes ele escreve algo lento.

---

## Resumo: quando usar o quê

- **Escolher colunas** → `SELECT col1, col2`
- **Filtrar linhas** → `WHERE condição`
- **Remover duplicatas** → `SELECT DISTINCT`
- **Ordenar** → `ORDER BY coluna [ASC|DESC]`
- **Pegar os N primeiros** → `ORDER BY ... LIMIT n`
- **Contar / somar / média / máximo / mínimo** → `COUNT(*)`, `SUM`, `AVG`, `MAX`, `MIN`
- **Contar por categoria** → `GROUP BY categoria` + `COUNT(*)`
- **Filtrar grupos por agregação** → `HAVING`
- **Classificar em faixas** → `CASE WHEN ... THEN ... END`
- **Tratar `NULL`** → `IS NULL`, `IS NOT NULL`, `COALESCE`
- **Buscar por padrão de texto** → `LIKE` (case-sensitive) ou `ILIKE`
- **Juntar tabelas** → `INNER JOIN` (só o que casa) ou `LEFT JOIN` (tudo da esquerda)
