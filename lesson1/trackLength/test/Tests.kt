import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Trivial")
    fun trackLength() {
        assertEquals(5.0, trackLength(3.0, 0.0, 0.0, 4.0), 1e-5)
        assertEquals(1.0, trackLength(0.0, 1.0, -1.0, 1.0), 1e-5)
        assertEquals(1.41, trackLength(1.0, 1.0, 2.0, 2.0), 1e-2)
    }
}