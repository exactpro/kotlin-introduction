import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Example")
    fun minBiRoot() {
        assertEquals(Double.NaN, minBiRoot(0.0, 0.0, 1.0), 1e-2)
        assertEquals(Double.NaN, minBiRoot(0.0, 1.0, 2.0), 1e-2)
        assertEquals(-2.0, minBiRoot(0.0, 1.0, -4.0), 1e-10)
        assertEquals(Double.NaN, minBiRoot(1.0, -2.0, 4.0), 1e-2)
        assertEquals(Double.NaN, minBiRoot(1.0, 3.0, 2.0), 1e-2)
        assertEquals(-1.41, minBiRoot(1.0, -3.0, 2.0), 1e-2)
    }
}