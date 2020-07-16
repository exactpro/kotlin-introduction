fun quadraticRootNumber(a: Double, b: Double, c: Double): Int {
    val discriminant = discriminant(a, b, c)
    return when {
        discriminant > 0.0 -> 2
        discriminant == 0.0 -> 1
        else -> 0
    }
}

fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

fun sqr(x: Double) = x * x