import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun triangleKind() {
        assertEquals(-1, triangleKind(3.0, 7.5, 4.0))
        assertEquals(1, triangleKind(5.0, 3.0, 4.0))
        assertEquals(2, triangleKind(4.0, 6.0, 8.0))
        assertEquals(0, triangleKind(1.0, 1.5, 1.5))
    }
}