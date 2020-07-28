import kotlin.math.sqrt

fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
    (-b + sqrt(discriminant(a, b, c))) / (2 * a)

fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

fun sqr(x: Double) = x * x