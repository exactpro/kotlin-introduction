### Простая

Определить, входит ли ассоциативный массив a в ассоциативный массив b;
это выполняется, если все ключи из a содержатся в b с такими же значениями.

Например:

    containsIn(
        mapOf("a" to "z"),
        mapOf("a" to "z", "b" to "sweet")
    ) -> true
    
    containsIn(
        mapOf("a" to "z"),
        mapOf("a" to "zee", "b" to "sweet")
    ) -> false