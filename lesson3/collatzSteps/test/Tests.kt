import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Normal")
    fun collatzSteps() {
        assertEquals(0, collatzSteps(1))
        assertEquals(1, collatzSteps(2))
        assertEquals(7, collatzSteps(3))
        assertEquals(5, collatzSteps(5))
        assertEquals(6, collatzSteps(10))
        assertEquals(7, collatzSteps(20))
        assertEquals(6, collatzSteps(64))
        assertEquals(25, collatzSteps(100))
        assertEquals(7, collatzSteps(128))
        assertEquals(111, collatzSteps(1000))
        assertEquals(128, collatzSteps(100000))
    }
}