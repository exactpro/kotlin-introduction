import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Example")
    fun quadraticRootNumber() {
        assertEquals(1, quadraticRootNumber(1.0, 2.0, 1.0))
        assertEquals(2, quadraticRootNumber(1.0, 3.0, 2.0))
        assertEquals(0, quadraticRootNumber(1.0, 4.0, 10.0))
    }
}