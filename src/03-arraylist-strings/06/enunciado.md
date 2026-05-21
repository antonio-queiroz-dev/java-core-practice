**Fase 3, Exercício 6 — Capitalizar palavras**

Dada uma frase, retorne a mesma frase com a **primeira letra de cada palavra em maiúscula** e o resto em minúscula.

```java
public String capitalizar(String frase) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: "eu gosto de java"
Saída: "Eu Gosto De Java"

Entrada: "HELLO WORLD"
Saída: "Hello World"

Entrada: "a"
Saída: "A"
```

**O que você precisa saber:**
- `split(" ")` pra separar as palavras
- `substring(0, 1)` pega o primeiro caractere como String
- `substring(1)` pega do segundo caractere até o final
- `toUpperCase()` e `toLowerCase()` convertem

O padrão é: separar, transformar cada palavra, juntar de volta. Vai lá!