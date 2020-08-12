import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Normal")
    fun accumulate() {
        assertEquals(listOf<Double>(), accumulate(arrayListOf()))
        assertArrayEquals(
            listOf(3).toIntArray(),
            accumulate(arrayListOf(3)).toIntArray()
        )
        assertArrayEquals(
            listOf(1, 3, 6, 10).toIntArray(),
            accumulate(arrayListOf(1, 2, 3, 4)).toIntArray()
        )
        val toMutate = mutableListOf(-3, -1, 4, 5, -5)
        assertTrue(toMutate === accumulate(toMutate)) { "You should mutate an input list, not create a copy" }
    }
}