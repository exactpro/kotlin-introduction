import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Normal")
    fun isPalindrome() {
        assertTrue(isPalindrome(3))
        assertFalse(isPalindrome(3653))
        assertTrue(isPalindrome(15751))
        assertTrue(isPalindrome(24688642))
    }
}