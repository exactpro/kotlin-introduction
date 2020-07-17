import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Impossible")
    fun russian() {
        assertEquals("триста семьдесят пять", russian(375))
        assertEquals("двадцать две тысячи девятьсот шестьдесят четыре", russian(22964))
        assertEquals("сто девятнадцать тысяч пятьсот восемь", russian(119508))
        assertEquals("две тысячи три", russian(2003))
        assertEquals("двести тысяч два", russian(200002))
        assertEquals("девятьсот тысяч", russian(900000))
        assertEquals("двенадцать", russian(12))
    }
}