import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun maxDivisor() {
        assertEquals(1, maxDivisor(17))
        assertEquals(12, maxDivisor(24))
        assertEquals(59, maxDivisor(177))
        assertEquals(17, maxDivisor(34))
        assertEquals(7, maxDivisor(49))
        assertEquals(509, maxDivisor(8653))
        assertEquals(1, maxDivisor(2124679))
        assertEquals(1, maxDivisor(1073676287))
        assertEquals(1, maxDivisor(Int.MAX_VALUE))
    }
}