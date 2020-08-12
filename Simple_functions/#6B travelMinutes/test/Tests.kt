import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun travelMinutes() {
        assertEquals(216, travelMinutes(9, 25, 13, 1))
        assertEquals(1, travelMinutes(21, 59, 22, 0))
    }
}