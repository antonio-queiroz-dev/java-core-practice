**Fase 2, Exercício 6 — Ponto de virada**

Dado um array de números inteiros, encontre o **índice** onde o array muda de crescente pra decrescente (ou vice-versa) pela primeira vez. Se não houver mudança, retorne `-1`.

```java
public int pontoDeVirada(int[] nums) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: [1, 3, 5, 4, 2]
Saída: 2 (no índice 2 o valor 5 é onde para de crescer e começa a decrescer)
```

```
Entrada: [5, 3, 1, 2, 4]
Saída: 2 (no índice 2 o valor 1 é onde para de decrescer e começa a crescer)
```

```
Entrada: [1, 2, 3, 4, 5]
Saída: -1 (só cresce, nunca muda)
```

```
Entrada: [5, 5, 3]
Saída: -1 (elementos iguais não contam como direção, só a queda de 5→3)
```

**Dica:** você precisa primeiro descobrir qual é a **direção inicial** (crescente ou decrescente), ignorando elementos iguais. Depois, percorre procurando o momento em que a direção muda. Esse exercício combina tudo da fase 2: comparar vizinhos, guardar estado, e pensar em casos de borda.

Se travar, me diz onde que eu dou uma dica.