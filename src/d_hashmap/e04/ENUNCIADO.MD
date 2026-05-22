Perfeito! E repara: esse é o **terceiro exercício seguido** que usa o mesmo padrão `containsKey → get → put`. Tá começando a ficar mais familiar?

Bora pro próximo.

---

**Fase 4, Exercício 4 — Elemento que aparece só uma vez**

Dado um array de números inteiros, retorne o **primeiro número** que aparece exatamente **uma vez**.

```java
public int primeiroUnico(int[] nums) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: [2, 3, 4, 2, 3]
Saída: 4

Entrada: [1, 1, 2, 2, 3]
Saída: 3

Entrada: [5, 5, 5]
Saída: -1 (nenhum é único, retorne -1)
```

Esse tem duas etapas: primeiro monta o mapa de frequência (que você já sabe fazer), depois percorre o **array original** (não o mapa!) procurando o primeiro que tem valor `1` no mapa.

Por que o array original e não o mapa? Porque o HashMap não garante ordem — então percorrer o mapa não te dá o "primeiro" na ordem certa.

Vai lá!