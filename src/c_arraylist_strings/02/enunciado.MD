Duas soluções e as duas corretas! Bom demais.

Sobre o que você mencionou:

O `charAt` retorna `char`, que usa aspas simples `'A'`.

String usa aspas duplas `"A"`. Isso é Java básico mas é normal esquecer — agora fixou.

O `indexOf` é simples: ele procura um caractere (ou String) dentro de outra String e

retorna a **posição** onde achou. Se não achou, retorna `-1`. Então `"AEIOU".indexOf('E')` retorna `1`, e `"AEIOU".indexOf('X')` retorna `-1`. Sua segunda solução usa isso de forma inteligente — se não é `-1`, é vogal. Não precisa de lista de estudo separada pra isso, vai fixar com a prática.

Sobre pedir ajuda pra IA: pedir **dica sem resposta** é válido, é como perguntar pro professor.

O problema é quando copia a solução inteira. Você fez certo.

---

**Fase 3, Exercício 2 — Inverter uma String**

Dada uma String, retorne ela **invertida**.

```java
public String inverterString(String texto) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: "casa"
Saída: "asac"

Entrada: "Java"
Saída: "avaJ"

Entrada: "a"
Saída: "a"
```

**Dica:** lembra quando inverteu o array na fase 1? A lógica é parecida. Percorre de trás pra frente e vai construindo uma nova String. Pra construir String pedaço por pedaço, você pode usar `+` (concatenar) ou pesquisar sobre `StringBuilder`.

Vai lá!