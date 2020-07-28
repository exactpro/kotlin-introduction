import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Example")
    fun gradeNotation() {
        assertEquals("отлично", gradeNotation(5))
        assertEquals("удовлетворительно", gradeNotation(3))
    }
}