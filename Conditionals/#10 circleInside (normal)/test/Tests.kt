import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Normal")
    fun circleInside() {
        assertFalse(circleInside(0.0, 0.0, 6.0, 0.0, 0.0, 5.0))
        assertFalse(circleInside(0.0, 0.0, 1.0, 10.0, 10.0, 9.0))
        assertTrue(circleInside(2.0, 2.0, 2.0, 2.0, 2.0, 2.0))
        assertTrue(circleInside(-2.0, 3.0, 2.0, -2.0, 0.0, 5.0))
        assertFalse(circleInside(1.0, 2.0, 3.0, 4.0, 5.0, 6.0))
    }
}