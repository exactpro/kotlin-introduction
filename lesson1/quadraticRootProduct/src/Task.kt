import kotlin.math.sqrt

fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 // Результат
}

fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

fun sqr(x: Double) = x * x