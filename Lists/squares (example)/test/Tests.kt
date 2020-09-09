import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Example")
    fun squares() {
        assertEquals(listOf(0), squares(listOf(0)))
        assertEquals(listOf(1, 4, 9), squares(listOf(1, 2, -3)))
    }
}