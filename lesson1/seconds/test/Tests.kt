import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Trivial")
    fun seconds() {
        assertEquals(30035, seconds(8, 20, 35))
        assertEquals(86400, seconds(24, 0, 0))
        assertEquals(13, seconds(0, 0, 13))
    }
}