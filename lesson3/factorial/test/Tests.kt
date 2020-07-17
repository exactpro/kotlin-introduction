import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Example")
    fun factorial() {
        assertEquals(1.0, factorial(0), 1e-5)
        assertEquals(1.0, factorial(1), 1e-5)
        assertEquals(6.0, factorial(3), 1e-5)
        assertEquals(120.0, factorial(5), 1e-5)
        assertEquals(3628800.0, factorial(10), 1e-5)
        assertEquals(2.43290200817664E18, factorial(20), 1E10)
    }
}