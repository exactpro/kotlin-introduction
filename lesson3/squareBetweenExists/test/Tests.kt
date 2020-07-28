import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun squareBetweenExists() {
        assertTrue(squareBetweenExists(1, 1))
        assertTrue(squareBetweenExists(21, 28))
        assertTrue(squareBetweenExists(36, 48))
        assertTrue(squareBetweenExists(50, 64))
        assertFalse(squareBetweenExists(51, 61))
        assertFalse(squareBetweenExists(999, 1001))
        assertTrue(squareBetweenExists(152374337, 152423715))
        assertFalse(squareBetweenExists(2147395601, Int.MAX_VALUE))
    }
}