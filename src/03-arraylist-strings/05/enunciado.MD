
Agora foco. Exercício 5:

---

**Fase 3, Exercício 5 — Primeira palavra repetida**

Dada uma frase, retorne a **primeira palavra que aparece mais de uma vez**.

```java
public String primeiraRepetida(String frase) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: "o gato viu o cachorro"
Saída: "o"

Entrada: "java é bom e java é legal"
Saída: "java"

Entrada: "sem repeticao aqui"
Saída: "" (string vazia)
```

**Dica:** usa `split(" ")` pra separar as palavras. Depois precisa de uma forma de saber se a palavra já apareceu. Lembra do exercício de remover duplicatas na fase 1? O `ArrayList` com `contains` resolve.

Vai lá!