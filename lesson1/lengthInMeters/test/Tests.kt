import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Trivial")
    fun lengthInMeters() {
        assertEquals(18.98, lengthInMeters(8, 2, 11), 1e-2)
        assertEquals(2.13, lengthInMeters(1, 0, 0), 1e-2)
    }
}