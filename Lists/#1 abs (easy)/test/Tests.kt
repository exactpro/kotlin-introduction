import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun abs() {
        assertEquals(0.0, abs(listOf()), 1e-5)
        assertEquals(3.0, abs(listOf(3.0)), 1e-5)
        assertEquals(5.0, abs(listOf(3.0, -4.0)), 1e-5)
        assertEquals(8.774964, abs(listOf(4.0, -5.0, 6.0)), 1e-5)
    }
}