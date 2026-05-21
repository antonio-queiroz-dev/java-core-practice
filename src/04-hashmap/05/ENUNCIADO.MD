**Fase 4, Exercício 5 — Verificar se duas palavras são anagramas**

Duas palavras são anagramas se usam **exatamente as mesmas letras na mesma quantidade** (ex: "roma" e "amor", "listen" e "silent").

```java
public boolean ehAnagrama(String a, String b) {
    // seu código aqui
}
```

**Exemplos:**

```
Entrada: "roma", "amor"
Saída: true

Entrada: "java", "vaja"
Saída: true

Entrada: "casa", "caso"
Saída: false

Entrada: "abc", "abcd"
Saída: false
```

**Dica:** monta o mapa de frequência de cada palavra (dois mapas). Depois compara se são iguais. HashMap tem o método `.equals()` que compara dois mapas — retorna `true` se têm as mesmas chaves com os mesmos valores.

Mesmo padrão de contar frequência, só que duas vezes. Vai lá!