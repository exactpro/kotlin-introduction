import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun ageDescription() {
        assertEquals("1 год", ageDescription(1))
        assertEquals("21 год", ageDescription(21))
        assertEquals("132 года", ageDescription(132))
        assertEquals("12 лет", ageDescription(12))
        assertEquals("111 лет", ageDescription(111))
        assertEquals("199 лет", ageDescription(199))
    }
}