Gostei da energia! Bora.

---

**Fase 4, Exercício 3 — Contar frequência de palavras**

Dada uma frase, retorne um `HashMap` com a frequência de cada palavra.

```java
public HashMap<String, Integer> contarPalavras(String frase) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: "o gato viu o gato"
Saída: {o=2, gato=2, viu=1}

Entrada: "java java java"
Saída: {java=3}

Entrada: "eu sou eu"
Saída: {eu=2, sou=1}
```

Mesmo padrão dos dois anteriores. A diferença: usa `split(" ")` pra separar as palavras e o HashMap é `<String, Integer>`.

Tenta fazer **sem olhar** os exercícios anteriores. Vai lá!