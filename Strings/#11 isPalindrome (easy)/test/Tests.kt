import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Example")
    fun isPalindrome() {
        assertFalse(isPalindrome("Барабан"))
        assertTrue(isPalindrome("А роза упала на лапу Азора"))
        assertTrue(isPalindrome("Шалаш"))
    }
}