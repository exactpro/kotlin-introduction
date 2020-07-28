import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun isNumberHappy() {
        assertTrue(isNumberHappy(1533))
        assertTrue(isNumberHappy(9009))
        assertFalse(isNumberHappy(3644))
    }
}