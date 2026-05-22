Saiu limpo e rápido. `nums[0]` como valor inicial, testou com negativos — não esqueceu nada. Tá aquecido.

---

**Fase 2, Exercício 3 — Diferença entre vizinhos**

Dado um array de números inteiros, retorne a **maior diferença absoluta** entre dois elementos vizinhos (lado a lado).

```java
public int maiorDiferencaVizinhos(int[] nums) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: [1, 3, 2, 8, 4]
Saída: 6 (entre 2 e 8)

Entrada: [5, 5, 5]
Saída: 0

Entrada: [10, 1]
Saída: 9
```

**Dica:** "diferença absoluta" significa que não importa a ordem — a diferença entre 2 e 8 é 6, e entre 8 e 2 também é 6. Em Java existe `Math.abs()` que te dá o valor absoluto de um número.

Esse combina dois padrões que você já fez: comparar vizinhos (fase 2) + guardar o maior valor (fase 1). Vai lá!