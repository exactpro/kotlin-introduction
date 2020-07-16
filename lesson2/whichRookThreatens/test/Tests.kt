import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun whichRookThreatens() {
        assertEquals(0, whichRookThreatens(1, 2, 3, 4, 5, 6))
        assertEquals(1, whichRookThreatens(5, 3, 7, 3, 4, 8))
        assertEquals(2, whichRookThreatens(6, 8, 8, 6, 6, 3))
        assertEquals(3, whichRookThreatens(3, 7, 8, 7, 3, 5))
    }
}