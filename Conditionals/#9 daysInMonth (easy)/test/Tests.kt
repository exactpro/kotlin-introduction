import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun daysInMonth() {
        assertEquals(31, daysInMonth(1, 1990))
        assertEquals(28, daysInMonth(2, 1990))
        assertEquals(31, daysInMonth(3, 1990))
        assertEquals(30, daysInMonth(4, 1990))
        assertEquals(31, daysInMonth(5, 1990))
        assertEquals(30, daysInMonth(6, 1990))
        assertEquals(31, daysInMonth(7, 1990))
        assertEquals(31, daysInMonth(8, 1990))
        assertEquals(29, daysInMonth(2, 1992))
        assertEquals(29, daysInMonth(2, 1996))
        assertEquals(28, daysInMonth(2, 1900))
        assertEquals(29, daysInMonth(2, 2000))
    }
}