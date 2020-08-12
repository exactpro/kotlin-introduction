import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Example")
    fun isPerfect() {
        assertTrue(isPerfect(6))
        assertTrue(isPerfect(28))
        assertFalse(isPerfect(100))
    }
}