Bora!

---

**Fase 4, Exercício 2 — Caractere mais frequente**

Dada uma String, retorne o **caractere que mais aparece**.

```java
public char caractereMaisFrequente(String texto) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: "abracadabra"
Saída: 'a' (aparece 5 vezes)

Entrada: "java"
Saída: 'a' (aparece 2 vezes)

Entrada: "xxx"
Saída: 'x'
```

É o mesmo padrão do exercício anterior: contar frequência. A diferença é que agora é `HashMap<Character, Integer>` em vez de `HashMap<Integer, Integer>`, e você percorre os caracteres da String com `texto.charAt(i)`.

Depois de montar o mapa de frequência, precisa percorrer o mapa pra achar qual chave tem o maior valor — que é o padrão "achar o maior" da fase 1.

Vai lá!