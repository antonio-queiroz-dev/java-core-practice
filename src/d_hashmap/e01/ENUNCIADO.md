Bom dia! Vamos começar a fase 4.

---

**Fase 4, Exercício 1 — Contar frequência de cada número**

Dado um array de números inteiros, retorne um `HashMap` onde a **chave** é o número e o **valor** é quantas vezes ele aparece.

```java
public HashMap<Integer, Integer> contarFrequencia(int[] nums) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: [1, 2, 2, 3, 3, 3]
Saída: {1=1, 2=2, 3=3}

Entrada: [5, 5, 5]
Saída: {5=3}

Entrada: [1, 2, 3]
Saída: {1=1, 2=1, 3=1}
```

**O que você precisa saber:**
- `HashMap<Integer, Integer> map = new HashMap<>()` cria o mapa
- `map.put(chave, valor)` insere ou atualiza
- `map.get(chave)` retorna o valor (ou `null` se não existe)
- `map.containsKey(chave)` retorna `true` se a chave já existe

A lógica é: percorre o array, pra cada número verifica se já tá no mapa. Se tiver, incrementa. Se não, coloca com valor 1.

Vai lá!