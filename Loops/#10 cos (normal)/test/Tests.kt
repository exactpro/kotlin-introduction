import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.math.PI

class Test {
    @Test
    @Tag("Normal")
    fun cos() {
        assertEquals(1.0, cos(0.0, 1e-5), 1e-5)
        assertEquals(0.0, cos(PI / 2.0, 1e-5), 1e-5)
        assertEquals(-1.0, cos(PI, 1e-5), 1e-5)
        assertEquals(0.0, cos(3.0 * PI / 2.0, 1e-5), 1e-5)
        assertEquals(1.0, cos(100 * PI, 1e-5), 1e-5)
        assertNotEquals(kotlin.math.cos(1.0), cos(1.0, 1.0))
        assertNotEquals(kotlin.math.cos(0.5), cos(-0.5, 1.0))
    }
}