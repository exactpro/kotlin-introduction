import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Normal")
    fun hasDifferentDigits() {
        assertTrue(hasDifferentDigits(323))
        assertTrue(hasDifferentDigits(54))
        assertTrue(hasDifferentDigits(222266666))
        assertFalse(hasDifferentDigits(0))
        assertFalse(hasDifferentDigits(777))
        assertTrue(hasDifferentDigits(31122))
    }
}