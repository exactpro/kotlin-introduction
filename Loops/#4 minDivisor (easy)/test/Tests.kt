import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun minDivisor() {
        assertEquals(2, minDivisor(2))
        assertEquals(3, minDivisor(75))
        assertEquals(5, minDivisor(75 / 3))
        assertEquals(97, minDivisor(97))
        assertEquals(7, minDivisor(49))
        assertEquals(17, minDivisor(8653))
        assertEquals(2124679, minDivisor(2124679))
        assertEquals(1073676287, minDivisor(1073676287))
        assertEquals(Int.MAX_VALUE, minDivisor(Int.MAX_VALUE))
    }
}