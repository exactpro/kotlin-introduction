### Средняя

Объединить два ассоциативных массива `mapA` и `mapB` с парами
"имя"-"номер телефона" в итоговый ассоциативный массив, склеивая
значения для повторяющихся ключей через запятую.

В случае повторяющихся *ключей* значение из mapA должно быть перед значением из mapB.
Повторяющиеся *значения* следует добавлять только один раз.

Например:

    mergePhoneBooks(
        mapOf(
            "Emergency" to "112",
            "Police" to "02"),
        mapOf(
            "Emergency" to "911",
            "Police" to "02")
    ) -> mapOf(
        "Emergency" to "112, 911",
        "Police" to "02")