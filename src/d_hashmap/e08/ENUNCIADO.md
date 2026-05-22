**Fase 4, Exercício 8 — Dois números somam ao alvo (Two Sum)**

Lembra desse? Foi o primeiro exercício que te passei e você não entendeu. Agora você tem as ferramentas.

Dado um array de números inteiros e um `alvo`, retorne os **índices** dos dois números que somados resultam no `alvo`.

```java
public int[] doisSomam(int[] nums, int alvo) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: nums = [2, 7, 11, 15], alvo = 9
Saída: [0, 1]
Explicação: nums[0] + nums[1] = 2 + 7 = 9

Entrada: nums = [3, 2, 4], alvo = 6
Saída: [1, 2]
Explicação: nums[1] + nums[2] = 2 + 4 = 6

Entrada: nums = [3, 3], alvo = 6
Saída: [0, 1]
```

**Dica:** pra cada número, o **complemento** é `alvo - num`. Se o `alvo` é `9` e o número atual é `2`, você precisa achar o `7`. A pergunta é: "o 7 já apareceu antes?" — e HashMap responde isso instantaneamente.

O mapa aqui é `HashMap<Integer, Integer>` onde a **chave** é o número e o **valor** é o índice dele no array.

Esse é mais difícil que os anteriores. Se travar, me diz onde.