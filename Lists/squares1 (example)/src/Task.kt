fun squares(vararg array: Int) = squares(array.toList()).toTypedArray()

fun squares(list: List<Int>) = list.map { it * it }
