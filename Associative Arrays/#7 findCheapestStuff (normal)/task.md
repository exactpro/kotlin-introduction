### Средняя

Входными данными является ассоциативный массив
"название товара"-"пара (тип товара, цена товара)"
и тип интересующего нас товара.

Необходимо вернуть название товара заданного типа с минимальной стоимостью
или null в случае, если товаров такого типа нет.

Например:

    findCheapestStuff(
        mapOf(
            "Мария" to ("печенье" to 20.0),
            "Орео" to ("печенье" to 100.0)),
        "печенье"
    ) -> "Мария"