import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Hard")
    fun mostExpensive() {
        assertEquals("", mostExpensive(""))
        assertEquals(
            "Курица",
            mostExpensive("Хлеб 39.9; Молоко 62.5; Курица 184.0; Конфеты 89.9")
        )
        assertEquals("Вино", mostExpensive("Вино 255.0"))
    }
}