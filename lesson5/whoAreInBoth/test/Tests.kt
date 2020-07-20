import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun whoAreInBoth() {
        assertEquals(
            emptyList<String>(),
            whoAreInBoth(emptyList(), emptyList())
        )
        assertEquals(
            listOf("Marat"),
            whoAreInBoth(listOf("Marat", "Mikhail"), listOf("Marat", "Kirill"))
        )
        assertEquals(
            emptyList<String>(),
            whoAreInBoth(listOf("Marat", "Mikhail"), listOf("Sveta", "Kirill"))
        )
    }
}