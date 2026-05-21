Bom dia! Vamos continuar a fase 4.

---

**Fase 4, Exercício 7 — Palavra mais frequente**

Dada uma frase, retorne a **palavra que mais aparece**.

```java
public String palavraMaisFrequente(String frase) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: "o gato viu o gato e o cachorro"
Saída: "o"

Entrada: "java java python"
Saída: "java"

Entrada: "hello"
Saída: "hello"
```

Mesmo padrão dos anteriores: `split` pra separar, mapa de frequência, percorrer o mapa pra achar o maior. A diferença é que agora é `HashMap<String, Integer>` e retorna uma `String`.

Tenta fazer sem olhar os anteriores. Vai lá!