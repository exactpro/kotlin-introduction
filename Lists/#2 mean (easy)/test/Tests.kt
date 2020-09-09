import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun mean() {
        assertEquals(0.0, mean(listOf()), 1e-5)
        assertEquals(1.0, mean(listOf(1.0)), 1e-5)
        assertEquals(2.0, mean(listOf(3.0, 1.0, 2.0)), 1e-5)
        assertEquals(3.0, mean(listOf(0.0, 2.0, 7.0, 8.0, -2.0)), 1e-5)
    }
}