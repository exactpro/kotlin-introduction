import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Example")
    fun digitCountInNumber() {
        assertEquals(1, digitCountInNumber(0, 0))
        assertEquals(1, digitCountInNumber(7, 7))
        assertEquals(0, digitCountInNumber(21, 3))
        assertEquals(1, digitCountInNumber(510, 5))
        assertEquals(3, digitCountInNumber(4784041, 4))
        assertEquals(4, digitCountInNumber(5373393, 3))
    }
}