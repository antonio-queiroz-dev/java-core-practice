Fase 2, Exercício 5 — Subarray crescente mais longo
---

Dado um array de números inteiros, encontre o comprimento da maior sequência consecutiva de números em ordem crescente.

java

```
public int maiorSequenciaCrescente(int[] nums) {
// seu código aqui
}
```

Exemplos:
```
Entrada: [1, 2, 3, 1, 2]

Saída: 3 (a sequência 1, 2, 3)
```

```
Entrada: [5, 4, 3, 2, 1]

Saída: 1 (nenhum par crescente, cada elemento sozinho)
```

```
Entrada: [1, 2, 1, 2, 3, 4]

Saída: 4 (a sequência 1, 2, 3, 4 no final)
```

```
Entrada: [10]

Saída: 1
```

Dica: você vai comparar vizinhos (padrão que já domina), mas agora precisa de dois contadores: um pro tamanho da sequência atual e outro pro maior tamanho que já encontrou. Quando a sequência quebra (o próximo não é maior), você reseta o contador atual.
Esse é o desafio da fase 2. Vai lá!