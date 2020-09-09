import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun gradeNotation() {
        assertEquals("отлично", gradeNotation(99))
        assertEquals("хорошо", gradeNotation(80))
        assertEquals("удовлетворительно", gradeNotation(60))
        assertEquals("неудовлетворительно", gradeNotation(25))
        assertEquals("Отсутсвуют исходные данные", gradeNotation(null))
        assertEquals("Некорректное значение: 120", gradeNotation(120))
    }
}