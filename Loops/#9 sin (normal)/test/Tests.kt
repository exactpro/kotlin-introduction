import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.math.PI

class Test {
    @Test
    @Tag("Normal")
    fun sin() {
        assertEquals(0.0, sin(0.0, 1e-5), 1e-5)
        assertEquals(1.0, sin(PI / 2.0, 1e-5), 1e-5)
        assertEquals(0.0, sin(PI, 1e-5), 1e-5)
        assertEquals(-1.0, sin(3.0 * PI / 2.0, 1e-5), 1e-5)
        assertEquals(0.0, sin(100 * PI, 1e-5), 1e-5)
        assertNotEquals(kotlin.math.sin(1.0), sin(1.0, 1.0))
        assertNotEquals(kotlin.math.sin(-0.5), sin(-0.5, 1.0))
    }
}