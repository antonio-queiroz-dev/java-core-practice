# Guia Completo: Streams em Java

## O que é Stream?

É uma forma de processar coleções (listas, arrays, sets) dizendo **o que você quer**, em vez de **como fazer**. Em vez de escrever `for`, `if`, variável auxiliar, `add`... você encadeia operações numa pipeline.

Pensa assim: você já conhece o SQL. Quando você escreve `SELECT nome FROM usuarios WHERE idade > 18`, você não diz pro banco "percorra linha por linha, verifique a idade, se for maior que 18 adicione numa lista temporária". Você diz **o que quer** e o banco resolve. Stream é a mesma filosofia aplicada ao Java.

---

## A estrutura: sempre 3 partes

Todo Stream segue esse esqueleto:

```java
resultado = colecao.stream()      // 1. FONTE — abre o fluxo
    .operacaoIntermediaria(...)    // 2. TRANSFORMAÇÃO — filtra, transforma, ordena
    .operacaoTerminal(...);        // 3. COLETA — recolhe o resultado final
```

**Analogia:** pensa numa esteira de supermercado (você conhece bem).

1. **Fonte** — os produtos são colocados na esteira (`.stream()`)
2. **Intermediária** — o operador separa o que é hortifrúti, remove o que está vencido, etc.
3. **Terminal** — os produtos que sobraram vão pra sacola (`.collect()`, `.toList()`, `.count()`)

Sem a operação terminal, **nada acontece**. Stream é preguiçoso (lazy) — ele só processa quando alguém pede o resultado final.

---

## Lambda: a sintaxe que assusta (mas é simples)

Antes de entrar nos métodos, você precisa entender lambda, porque Stream usa o tempo todo.

Lambda é um jeito curto de escrever uma função anônima. Veja:

```java
// Jeito antigo (classe anônima):
Predicate<Integer> ehPar = new Predicate<Integer>() {
    @Override
    public boolean test(Integer n) {
        return n % 2 == 0;
    }
};

// Jeito com lambda (faz a mesma coisa):
Predicate<Integer> ehPar = n -> n % 2 == 0;
```

A regra é simples:

```
(parâmetros) -> expressão
```

- Se tem **1 parâmetro**, os parênteses são opcionais: `n -> n * 2`
- Se tem **mais de 1**, precisa de parênteses: `(a, b) -> a + b`
- Se o corpo tem **mais de 1 linha**, usa chaves e `return`:

```java
n -> {
    int dobro = n * 2;
    return dobro + 1;
}
```

**Dica:** na maioria dos exercícios de Stream, o lambda é de uma linha. Se ficou com mais, provavelmente dá pra simplificar.

---

## Interfaces Funcionais (o tipo do lambda)

Cada lambda tem um "tipo". Os mais comuns em Streams:

| Interface | O que faz | Assinatura | Exemplo |
|-----------|-----------|------------|---------|
| `Predicate<T>` | Testa uma condição | `T → boolean` | `n -> n > 5` |
| `Function<T, R>` | Transforma um valor | `T → R` | `s -> s.length()` |
| `Consumer<T>` | Consome um valor (sem retorno) | `T → void` | `s -> System.out.println(s)` |
| `Comparator<T>` | Compara dois valores | `(T, T) → int` | `(a, b) -> a - b` |
| `Supplier<T>` | Fornece um valor (sem entrada) | `() → T` | `() -> new ArrayList<>()` |

Você não precisa decorar isso. Na prática:
- Usou `filter`? O lambda é um **Predicate** (retorna true/false)
- Usou `map`? O lambda é uma **Function** (transforma A em B)
- Usou `forEach`? O lambda é um **Consumer** (faz algo, não retorna)

---

## Operações Intermediárias

Essas operações transformam o stream mas **não produzem resultado sozinhas**. Você pode encadear quantas quiser.

### `filter(condição)` — Filtrar elementos

Mantém apenas os elementos que passam no teste. Os que não passam são descartados.

```java
List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

List<Integer> pares = numeros.stream()
    .filter(n -> n % 2 == 0)
    .toList();
// [2, 4, 6, 8, 10]
```

Sem Stream, o equivalente seria:

```java
List<Integer> pares = new ArrayList<>();
for (int n : numeros) {
    if (n % 2 == 0) {
        pares.add(n);
    }
}
```

O `filter` substituiu o `for` + `if` + `add`.

---

### `map(transformação)` — Transformar cada elemento

Aplica uma função a cada elemento e retorna o resultado. O tipo pode mudar.

```java
List<String> nomes = List.of("junior", "daniel", "maria");

// Transformar em maiúsculo
List<String> maiusculos = nomes.stream()
    .map(nome -> nome.toUpperCase())
    .toList();
// [JUNIOR, DANIEL, MARIA]

// Pegar o tamanho de cada nome (String → Integer)
List<Integer> tamanhos = nomes.stream()
    .map(nome -> nome.length())
    .toList();
// [6, 6, 5]
```

**`map` não filtra, transforma.** Entra N elementos, saem N elementos — cada um transformado.

---

### `map` com Method Reference

Quando o lambda só chama um método existente, você pode usar a sintaxe de referência:

```java
// Lambda:
.map(nome -> nome.toUpperCase())

// Method reference (faz a mesma coisa):
.map(String::toUpperCase)
```

A regra: se o lambda é `x -> x.metodo()`, pode virar `Classe::metodo`.

Outros exemplos:
- `n -> String.valueOf(n)` → `String::valueOf`
- `s -> System.out.println(s)` → `System.out::println`
- `s -> s.length()` → `String::length`

---

### `sorted()` — Ordenar

Ordena os elementos. Sem argumento, usa a ordem natural. Com `Comparator`, você define a ordem.

```java
List<Integer> nums = List.of(5, 2, 8, 1, 9);

// Ordem natural (crescente)
List<Integer> crescente = nums.stream()
    .sorted()
    .toList();
// [1, 2, 5, 8, 9]

// Ordem decrescente
List<Integer> decrescente = nums.stream()
    .sorted(Comparator.reverseOrder())
    .toList();
// [9, 8, 5, 2, 1]

// Ordenar strings por tamanho
List<String> nomes = List.of("Ana", "Junior", "Lu");
List<String> porTamanho = nomes.stream()
    .sorted(Comparator.comparingInt(String::length))
    .toList();
// [Lu, Ana, Junior]
```

---

### `distinct()` — Remover duplicatas

Remove elementos repetidos (usa `.equals()` pra comparar).

```java
List<Integer> nums = List.of(1, 2, 2, 3, 3, 3);

List<Integer> unicos = nums.stream()
    .distinct()
    .toList();
// [1, 2, 3]
```

**Conexão com HashMap:** lembra que `HashSet` remove duplicatas? O `distinct()` faz a mesma coisa internamente.

---

### `limit(n)` e `skip(n)` — Recortar

```java
List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Pegar os 3 primeiros
nums.stream().limit(3).toList();       // [1, 2, 3]

// Pular os 3 primeiros
nums.stream().skip(3).toList();        // [4, 5, 6, 7, 8, 9, 10]

// Pular 2, pegar 3 (paginação!)
nums.stream().skip(2).limit(3).toList(); // [3, 4, 5]
```

**Conexão com Spring:** isso é exatamente o que `Pageable` faz por baixo no Spring Data — skip + limit.

---

### `peek(ação)` — Espiar sem alterar

Executa uma ação em cada elemento sem modificar o stream. Útil pra debug.

```java
List<Integer> resultado = nums.stream()
    .filter(n -> n > 3)
    .peek(n -> System.out.println("Passou no filtro: " + n))
    .map(n -> n * 2)
    .toList();
```

**Regra:** `peek` é pra debug. Nunca use pra lógica de negócio.

---

### `flatMap(transformação)` — Achatar listas aninhadas

Quando cada elemento vira uma lista e você quer juntar tudo numa lista só.

```java
List<List<String>> listas = List.of(
    List.of("a", "b"),
    List.of("c", "d"),
    List.of("e")
);

// map daria: Stream<List<String>> — lista de listas (não é o que queremos)
// flatMap achata: Stream<String> — tudo junto

List<String> tudo = listas.stream()
    .flatMap(lista -> lista.stream())
    .toList();
// [a, b, c, d, e]
```

**Analogia:** `map` é "transforme cada caixa". `flatMap` é "abra cada caixa e jogue tudo no mesmo monte".

---

## Operações Terminais

Essas operações **disparam** o processamento e produzem o resultado final. Sem elas, nada acontece.

### `toList()` / `collect(Collectors.toList())` — Coletar em lista

```java
// Java 16+: toList() (retorna lista imutável)
List<Integer> resultado = nums.stream().filter(n -> n > 3).toList();

// Qualquer versão: collect (retorna lista mutável)
List<Integer> resultado = nums.stream().filter(n -> n > 3).collect(Collectors.toList());
```

**Diferença:** `toList()` é mais limpo mas retorna lista imutável (não pode dar `.add()` depois). Se precisar modificar a lista resultante, use `collect(Collectors.toList())`.

---

### `collect(Collectors.toSet())` — Coletar em Set

```java
Set<Integer> unicos = nums.stream()
    .collect(Collectors.toSet());
```

---

### `collect(Collectors.toMap())` — Coletar em HashMap

Aqui você junta Streams com HashMap:

```java
List<String> nomes = List.of("Junior", "Daniel", "Ana");

// nome → tamanho do nome
Map<String, Integer> mapa = nomes.stream()
    .collect(Collectors.toMap(
        nome -> nome,           // função pra chave
        nome -> nome.length()   // função pra valor
    ));
// {Junior=6, Daniel=6, Ana=3}
```

**Cuidado:** se duas chaves forem iguais, dá exceção. Pra resolver, passe uma função de merge:

```java
.collect(Collectors.toMap(
    nome -> nome.length(),    // chave: tamanho
    nome -> nome,             // valor: nome
    (existente, novo) -> existente + ", " + novo  // se colidir, junta
));
// {6=Junior, Daniel, 3=Ana}  → NÃO, na verdade: {6=Junior, Daniel, 3=Ana}
```

---

### `collect(Collectors.groupingBy())` — Agrupar

Lembra do Padrão 3 do guia de HashMap (agrupar elementos)? Streams faz isso em uma linha:

```java
// COM HashMap (como você aprendeu):
HashMap<Integer, List<String>> grupos = new HashMap<>();
for (String p : palavras) {
    int tamanho = p.length();
    if (!grupos.containsKey(tamanho)) {
        grupos.put(tamanho, new ArrayList<>());
    }
    grupos.get(tamanho).add(p);
}

// COM Streams (mesma coisa, uma linha):
Map<Integer, List<String>> grupos = palavras.stream()
    .collect(Collectors.groupingBy(String::length));
// {2=[oi, ar], 3=[sol, lua, mar]}
```

Seis linhas viraram uma. O resultado é idêntico.

---

### `collect(Collectors.counting())` — Contar por grupo

Combina com `groupingBy` pra contar frequência:

```java
// Contar frequência de cada palavra
Map<String, Long> freq = palavras.stream()
    .collect(Collectors.groupingBy(
        p -> p,                    // agrupa pela própria palavra
        Collectors.counting()      // conta cada grupo
    ));
```

**Conexão com HashMap:** isso substitui o padrão `getOrDefault(chave, 0) + 1`.

---

### `collect(Collectors.joining())` — Juntar strings

```java
List<String> palavras = List.of("Java", "é", "legal");

String frase = palavras.stream()
    .collect(Collectors.joining(" "));
// "Java é legal"

String csv = palavras.stream()
    .collect(Collectors.joining(", "));
// "Java, é, legal"
```

---

### `forEach(ação)` — Executar ação em cada elemento

```java
nomes.stream()
    .filter(n -> n.length() > 3)
    .forEach(System.out::println);
```

**Diferença de `map`:** `forEach` não retorna nada — é uma operação terminal. `map` transforma e continua o stream.

**Regra prática:** se precisa do resultado transformado → `map`. Se só quer executar algo (imprimir, salvar) → `forEach`.

---

### `count()` — Contar elementos

```java
long quantosPares = numeros.stream()
    .filter(n -> n % 2 == 0)
    .count();
// 5
```

---

### `findFirst()` e `findAny()` — Encontrar um elemento

Retornam `Optional` (pode ou não ter valor):

```java
Optional<Integer> primeiro = numeros.stream()
    .filter(n -> n > 5)
    .findFirst();
// Optional[6]

// Pra pegar o valor:
int valor = primeiro.orElse(0);        // retorna 0 se não encontrou
int valor = primeiro.orElseThrow();    // lança exceção se não encontrou
```

---

### `anyMatch`, `allMatch`, `noneMatch` — Testar condições

```java
List<Integer> nums = List.of(1, 2, 3, 4, 5);

nums.stream().anyMatch(n -> n > 4);    // true — algum é maior que 4?
nums.stream().allMatch(n -> n > 0);    // true — TODOS são maiores que 0?
nums.stream().noneMatch(n -> n > 10);  // true — NENHUM é maior que 10?
```

---

### `reduce()` — Reduzir a um único valor

Combina todos os elementos em um só resultado.

```java
List<Integer> nums = List.of(1, 2, 3, 4, 5);

// Somar tudo
int soma = nums.stream()
    .reduce(0, (acumulador, elemento) -> acumulador + elemento);
// 0 + 1 = 1, 1 + 2 = 3, 3 + 3 = 6, 6 + 4 = 10, 10 + 5 = 15

// Forma mais simples pra soma:
int soma = nums.stream().reduce(0, Integer::sum);

// Encontrar o maior
Optional<Integer> maior = nums.stream()
    .reduce(Integer::max);
// Optional[5]
```

O primeiro argumento (`0`) é o valor inicial. A função diz como combinar dois elementos.

---

## Streams Especializados (int, long, double)

Pra evitar autoboxing (conversão Integer ↔ int), existem streams de primitivos:

```java
// IntStream — evita autoboxing, tem métodos extras
int soma = numeros.stream()
    .mapToInt(Integer::intValue)   // Stream<Integer> → IntStream
    .sum();                         // método direto, sem reduce

double media = numeros.stream()
    .mapToInt(Integer::intValue)
    .average()
    .orElse(0.0);

IntSummaryStatistics stats = numeros.stream()
    .mapToInt(Integer::intValue)
    .summaryStatistics();

stats.getSum();     // soma
stats.getAverage(); // média
stats.getMin();     // mínimo
stats.getMax();     // máximo
stats.getCount();   // quantidade
```

**Quando usar:** quando está trabalhando com números e precisa de soma/média/min/max. Evita criar objetos Integer desnecessários.

---

## Criando Streams (além de `.stream()`)

```java
// De valores avulsos
Stream<String> s = Stream.of("a", "b", "c");

// De array
int[] arr = {1, 2, 3};
IntStream s = Arrays.stream(arr);

// Gerar sequência
IntStream.range(0, 5)        // [0, 1, 2, 3, 4] — exclusivo no final
IntStream.rangeClosed(1, 5)  // [1, 2, 3, 4, 5] — inclusivo no final

// Gerar infinito (precisa de limit!)
Stream.generate(() -> "hello").limit(5);    // 5x "hello"
Stream.iterate(1, n -> n * 2).limit(5);     // [1, 2, 4, 8, 16]
```

---

## Encadeamento: a força do Stream

O poder real aparece quando você combina operações:

```java
List<String> nomes = List.of("junior", "daniel", "ana", "maria", "lu");

// Pegue os nomes com mais de 3 letras, coloque em maiúsculo, ordene, e junte com vírgula
String resultado = nomes.stream()
    .filter(n -> n.length() > 3)           // [junior, daniel, maria]
    .map(String::toUpperCase)              // [JUNIOR, DANIEL, MARIA]
    .sorted()                              // [DANIEL, JUNIOR, MARIA]
    .collect(Collectors.joining(", "));    // "DANIEL, JUNIOR, MARIA"
```

Sem Streams, isso seriam ~10 linhas com for, if, lista temporária, Collections.sort, StringBuilder...

---

## Stream NÃO é reutilizável

```java
Stream<Integer> s = numeros.stream().filter(n -> n > 3);

s.toList();   // OK
s.count();    // ERRO: IllegalStateException — stream already closed
```

Cada Stream só pode ser consumido **uma vez**. Se precisar de dois resultados, abra dois streams.

---

## Erros Comuns

### 1. Esquecer a operação terminal

```java
// NÃO FAZ NADA — sem operação terminal, o stream não executa
numeros.stream().filter(n -> n > 3).map(n -> n * 2);
```

### 2. Tentar reutilizar o stream

```java
Stream<Integer> s = numeros.stream();
s.count();    // OK
s.toList();   // ERRO — stream já foi consumido
```

### 3. Modificar a coleção original durante o stream

```java
// ERRADO — ConcurrentModificationException
numeros.stream().forEach(n -> numeros.remove(n));

// CERTO — crie uma nova lista
List<Integer> filtrado = numeros.stream().filter(n -> n > 3).toList();
```

### 4. Usar stream pra tudo

```java
// OVERENGINEERING — stream não faz sentido aqui
String primeiro = lista.stream().findFirst().orElse("");

// SIMPLES E MELHOR:
String primeiro = lista.isEmpty() ? "" : lista.get(0);
```

Stream brilha em transformações complexas. Pra operações simples, às vezes um `for` ou acesso direto é mais claro.

---

## Comparação: Imperativo vs Stream

### Exemplo: "Dos produtos, pegue os que custam mais de R$50, extraia o nome e ordene"

```java
// IMPERATIVO (como fazer):
List<String> resultado = new ArrayList<>();
for (Produto p : produtos) {
    if (p.getPreco() > 50) {
        resultado.add(p.getNome());
    }
}
Collections.sort(resultado);

// STREAM (o que quero):
List<String> resultado = produtos.stream()
    .filter(p -> p.getPreco() > 50)
    .map(Produto::getNome)
    .sorted()
    .toList();
```

As duas formas fazem a mesma coisa. A segunda é mais expressiva e menos propensa a erros.

---

## Conexão com o que você já sabe

- **SQL:** `SELECT nome FROM produtos WHERE preco > 50 ORDER BY nome` é literalmente `stream().filter().map().sorted()`. A correspondência é direta.
- **Spring Data:** quando você faz `findByPrecoGreaterThan(50)`, o Spring gera SQL — é a mesma ideia de pipeline declarativa.
- **HashMap + Streams:** você pode pegar o `entrySet()` de um HashMap e processar com stream. Ex: "pegue todas as chaves cujo valor é maior que 10" → `map.entrySet().stream().filter(e -> e.getValue() > 10).map(Map.Entry::getKey).toList()`.
- **Java 21 (que você usa):** todas as features mostradas aqui funcionam. O `toList()` sem Collectors está disponível desde o Java 16.

---

## Resumo: quando usar o quê

- **Preciso filtrar elementos** → `.filter(condição)`
- **Preciso transformar cada elemento** → `.map(transformação)`
- **Preciso achatar listas dentro de listas** → `.flatMap()`
- **Preciso agrupar por categoria** → `Collectors.groupingBy()`
- **Preciso coletar num Map** → `Collectors.toMap()`
- **Preciso contar, somar, média** → `.count()`, `mapToInt().sum()`, `.average()`
- **Preciso encontrar um elemento** → `.findFirst()`, `.findAny()`
- **Preciso testar uma condição geral** → `.anyMatch()`, `.allMatch()`, `.noneMatch()`
- **Preciso juntar strings** → `Collectors.joining()`
- **Preciso reduzir tudo a um valor** → `.reduce()`
