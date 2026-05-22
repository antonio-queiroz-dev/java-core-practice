Bom dia! Vamos lá.

---

**Fase 3, Exercício 3 — É palíndromo?**

Dada uma String, retorne `true` se ela for um **palíndromo** (lê igual de trás pra frente), ignorando maiúsculas/minúsculas.

```java
public boolean ePalindromo(String texto) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: "ana"
Saída: true

Entrada: "Ovo"
Saída: true (O e o são iguais ignorando maiúscula)

Entrada: "Java"
Saída: false

Entrada: "a"
Saída: true
```

Você já tem todas as peças: sabe inverter uma String e sabe comparar. Agora é juntar.

**Detalhe importante:** pra comparar Strings em Java, não use `==`. Use `.equals()`. Então `"abc" == "abc"` pode falhar, mas `"abc".equals("abc")` funciona sempre.

Vai lá — esse é o famoso!