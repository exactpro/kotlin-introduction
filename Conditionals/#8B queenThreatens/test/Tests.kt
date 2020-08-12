import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun queenThreatens() {
        assertTrue(queenThreatens(3, 6, 7, 6))
        assertTrue(queenThreatens(8, 1, 1, 8))
        assertFalse(queenThreatens(7, 6, 5, 7))
    }
}