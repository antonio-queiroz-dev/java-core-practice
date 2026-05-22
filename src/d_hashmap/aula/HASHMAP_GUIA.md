# Guia Completo: HashMap em Java

## O que é um HashMap?

É uma estrutura de dados que armazena pares de **chave → valor**. Funciona como um dicionário: você tem uma palavra (chave) e uma definição (valor). A busca por chave é instantânea — O(1) — não importa se tem 10 ou 10 milhões de elementos.

Você já conhece esse conceito: o Redis que você usa no PawsManager é essencialmente um HashMap gigante que vive fora da JVM. A diferença é que o `HashMap` do Java vive na memória da aplicação e morre quando o programa termina.

---

## Como funciona por dentro?

O HashMap usa internamente um **array de buckets**. Quando você faz `map.put("nome", "Junior")`:

1. O Java chama `"nome".hashCode()` — que gera um número inteiro (ex: `3373752`)
2. Esse número é convertido em um **índice do array** (ex: posição 8)
3. O par chave-valor é armazenado nessa posição

Quando você faz `map.get("nome")`:

1. Calcula o `hashCode()` de `"nome"` de novo — gera o mesmo número
2. Vai direto na posição 8 do array
3. Retorna o valor — sem percorrer nada

**Por isso a busca é O(1):** ele não precisa percorrer todos os elementos, vai direto na posição certa.

### E se duas chaves caírem na mesma posição? (Colisão)

Isso acontece. Quando duas chaves geram o mesmo índice, o Java armazena ambas na mesma posição usando uma lista encadeada (ou árvore, se ficar grande). Na hora do `get`, ele usa o `.equals()` pra encontrar a chave certa dentro dessa lista.

**Por isso `hashCode()` e `equals()` andam juntos:** o `hashCode()` encontra a posição, o `equals()` confirma que é a chave certa.

---

## Criando um HashMap

```java
// HashMap<TipoChave, TipoValor>
HashMap<String, Integer> map = new HashMap<>();

// Exemplos de tipos comuns:
HashMap<Integer, Integer> contagem = new HashMap<>();     // número → número
HashMap<String, String> dicionario = new HashMap<>();      // texto → texto
HashMap<String, List<String>> grupos = new HashMap<>();    // texto → lista de textos
```

**Importante:** HashMap não aceita tipos primitivos (`int`, `char`, `boolean`). Use as classes wrapper (`Integer`, `Character`, `Boolean`). O Java faz a conversão automática (autoboxing), então na prática você nem percebe.

---

## Métodos Principais

### `put(chave, valor)` — Inserir ou atualizar

Coloca um par chave-valor no mapa. Se a chave já existir, **sobrescreve** o valor antigo.

```java
HashMap<String, Integer> idade = new HashMap<>();

idade.put("Junior", 24);     // insere: {Junior=24}
idade.put("Daniel", 18);     // insere: {Junior=24, Daniel=18}
idade.put("Junior", 25);     // ATUALIZA: {Junior=25, Daniel=18}
// A chave "Junior" já existia, então o valor mudou de 24 para 25
```

**Quando usar:** sempre que quiser adicionar ou atualizar um dado no mapa.

---

### `get(chave)` — Buscar valor

Retorna o valor associado à chave. Se a chave **não existir**, retorna `null`.

```java
Integer idadeJunior = idade.get("Junior");   // retorna 25
Integer idadeMaria = idade.get("Maria");     // retorna null (não existe)
```

**Cuidado com null:** se você fizer `idade.get("Maria") + 1`, vai dar `NullPointerException` porque `null + 1` não funciona. Sempre verifique antes.

**Quando usar:** sempre que quiser consultar o valor de uma chave.

---

### `getOrDefault(chave, valorPadrao)` — Buscar com fallback

Funciona igual ao `get`, mas se a chave não existir, retorna o valor padrão em vez de `null`.

```java
int idadeJunior = idade.getOrDefault("Junior", 0);   // retorna 25
int idadeMaria = idade.getOrDefault("Maria", 0);     // retorna 0 (não existe, usa o padrão)
```

**Quando usar:** é o substituto seguro do `get`. Muito útil pra contagem — em vez de verificar se a chave existe antes de incrementar, você faz:

```java
// SEM getOrDefault (verboso):
if (map.containsKey(chave)) {
    map.put(chave, map.get(chave) + 1);
} else {
    map.put(chave, 1);
}

// COM getOrDefault (limpo):
map.put(chave, map.getOrDefault(chave, 0) + 1);
```

As duas formas fazem a mesma coisa. A segunda é a forma idiomática do Java.

---

### `containsKey(chave)` — Verificar se a chave existe

Retorna `true` se o mapa contém a chave, `false` se não.

```java
idade.containsKey("Junior");   // true
idade.containsKey("Maria");    // false
```

**Quando usar:** quando você precisa saber se algo já foi registrado antes de fazer alguma operação.

---

### `containsValue(valor)` — Verificar se o valor existe

Retorna `true` se alguma chave possui esse valor. **Atenção:** essa operação é O(n) — percorre todos os valores. Diferente do `containsKey` que é O(1).

```java
idade.containsValue(25);    // true (Junior tem 25)
idade.containsValue(99);    // false
```

**Quando usar:** raramente. Se você precisa buscar por valor frequentemente, talvez a estrutura de dados esteja invertida.

---

### `remove(chave)` — Remover um par

Remove a chave e seu valor do mapa. Retorna o valor que foi removido (ou `null` se não existia).

```java
Integer removido = idade.remove("Daniel");   // remove Daniel, retorna 18
Integer nada = idade.remove("Maria");        // não existia, retorna null
```

---

### `size()` — Quantidade de pares

Retorna quantos pares chave-valor existem no mapa.

```java
idade.size();   // retorna 1 (só sobrou Junior depois do remove)
```

---

### `isEmpty()` — Verificar se está vazio

```java
idade.isEmpty();   // false (tem 1 elemento)
new HashMap<>().isEmpty();   // true
```

---

### `keySet()` — Todas as chaves

Retorna um `Set` com todas as chaves. Útil pra percorrer o mapa.

```java
HashMap<String, Integer> frutas = new HashMap<>();
frutas.put("banana", 3);
frutas.put("maça", 5);
frutas.put("uva", 2);

for (String fruta : frutas.keySet()) {
    System.out.println(fruta);   // imprime: banana, maça, uva (ordem não garantida)
}
```

---

### `values()` — Todos os valores

Retorna uma `Collection` com todos os valores.

```java
for (Integer quantidade : frutas.values()) {
    System.out.println(quantidade);   // imprime: 3, 5, 2
}
```

---

### `entrySet()` — Todos os pares (chave + valor)

Retorna um `Set` de `Map.Entry`, onde cada entry tem `.getKey()` e `.getValue()`. É a forma mais completa de percorrer o mapa.

```java
for (Map.Entry<String, Integer> entry : frutas.entrySet()) {
    System.out.println(entry.getKey() + " → " + entry.getValue());
}
// banana → 3
// maça → 5
// uva → 2
```

**Quando usar:** quando você precisa da chave E do valor ao mesmo tempo no loop.

---

## Padrões Comuns em Entrevistas

### Padrão 1: Contar frequência

O uso mais comum em entrevistas. "Quantas vezes cada elemento aparece?"

```java
int[] nums = {1, 2, 2, 3, 3, 3};
HashMap<Integer, Integer> freq = new HashMap<>();

for (int n : nums) {
    freq.put(n, freq.getOrDefault(n, 0) + 1);
}
// freq = {1=1, 2=2, 3=3}
```

### Padrão 2: Verificar existência (substituir segundo for)

Em vez de usar dois `for` pra verificar se algo existe, usa HashMap pra busca instantânea.

```java
// RUIM - O(n²): dois for aninhados
for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < i; j++) {
        if (nums[i] == nums[j]) // achou duplicata
    }
}

// BOM - O(n): um for + HashSet
HashSet<Integer> vistos = new HashSet<>();
for (int n : nums) {
    if (vistos.contains(n)) // achou duplicata
    vistos.add(n);
}
```

### Padrão 3: Agrupar elementos

"Agrupe as palavras por tamanho", "Agrupe os alunos por nota"

```java
String[] palavras = {"oi", "sol", "lua", "ar", "mar"};
HashMap<Integer, List<String>> grupos = new HashMap<>();

for (String p : palavras) {
    int tamanho = p.length();
    if (!grupos.containsKey(tamanho)) {
        grupos.put(tamanho, new ArrayList<>());
    }
    grupos.get(tamanho).add(p);
}
// {2=[oi, ar], 3=[sol, lua, mar]}
```

---

## HashMap vs HashSet

| Aspecto       | HashMap                  | HashSet               |
|---------------|--------------------------|------------------------|
| Armazena      | Pares chave → valor      | Apenas chaves (valores únicos) |
| Uso principal | Associar dados           | Verificar existência    |
| Exemplo       | "banana" → 3             | {"banana", "uva"}      |
| Busca         | `map.get(chave)`         | `set.contains(valor)`  |

**HashSet** por dentro é um HashMap onde o valor é ignorado. Quando você só precisa saber "isso já apareceu?", use `HashSet`. Quando precisa associar um dado a outro, use `HashMap`.

---

## Complexidade (Big O)

| Operação       | Tempo  | Por quê                              |
|----------------|--------|---------------------------------------|
| `put`          | O(1)   | Vai direto na posição via hashCode    |
| `get`          | O(1)   | Mesma lógica do put                   |
| `containsKey`  | O(1)   | Mesma lógica do put                   |
| `containsValue`| O(n)   | Precisa percorrer todos os valores    |
| `remove`       | O(1)   | Vai direto na posição                 |
| `keySet/values`| O(n)   | Retorna todos, precisa percorrer      |

---

## Erros Comuns

### 1. Esquecer que a ordem não é garantida

```java
map.put("c", 3);
map.put("a", 1);
map.put("b", 2);
// Ao imprimir, pode sair em qualquer ordem: {a=1, b=2, c=3} ou {c=3, a=1, b=2}
// Se precisar de ordem, use LinkedHashMap (mantém ordem de inserção)
// ou TreeMap (mantém ordem alfabética/numérica)
```

### 2. Comparar com == em vez de .equals()

```java
// ERRADO: compara referência de memória
if (map.get("nome") == "Junior")

// CERTO: compara o conteúdo
if ("Junior".equals(map.get("nome")))
```

Dica: colocar o literal primeiro (`"Junior".equals(...)`) evita NullPointerException se o `get` retornar null.

### 3. Não verificar null no get()

```java
// PERIGOSO:
int valor = map.get("chave");   // NullPointerException se não existir

// SEGURO:
int valor = map.getOrDefault("chave", 0);
```

---

## Conexão com o que você já sabe

- **Redis**: chave → valor com TTL. HashMap é a mesma ideia sem TTL e dentro da JVM.
- **@Cacheable do Spring**: por baixo usa um Map. Quando você anota um método, o Spring guarda o retorno num mapa onde a chave são os parâmetros.
- **Banco de dados**: uma tabela com coluna `id` (chave) e outras colunas (valor) é conceitualmente um HashMap gigante persistido em disco.

---

## Resumo: quando usar o quê

- **Preciso contar quantas vezes algo aparece** → `HashMap<Tipo, Integer>` com `getOrDefault`
- **Preciso saber se algo já apareceu** → `HashSet<Tipo>` com `contains`
- **Preciso agrupar coisas por categoria** → `HashMap<Tipo, List<Tipo>>`
- **Preciso buscar um valor por identificador** → `HashMap<Id, Valor>`
