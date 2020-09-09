import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Easy")
    fun lcm() {
        assertEquals(13, lcm(13, 13))
        assertEquals(8, lcm(2, 8))
        assertEquals(24, lcm(6, 8))
        assertEquals(975, lcm(39, 75))
        assertEquals(13384091, lcm(1357, 9863))
        assertEquals(1339310349, lcm(13579, 98631))
        assertEquals(2089830349, lcm(23579, 88631))
        assertEquals(2022222222, lcm(2, 1011111111))
        assertEquals(2022222222, lcm(1011111111, 2))
    }
}