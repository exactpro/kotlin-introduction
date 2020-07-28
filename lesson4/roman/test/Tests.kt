import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Hard")
    fun roman() {
        assertEquals("I", roman(1))
        assertEquals("MMM", roman(3000))
        assertEquals("MCMLXXVIII", roman(1978))
        assertEquals("DCXCIV", roman(694))
        assertEquals("XLIX", roman(49))
    }
}