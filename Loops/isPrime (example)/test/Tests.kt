import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Example")
    fun isPrime() {
        assertFalse(isPrime(1))
        assertTrue(isPrime(2))
        assertTrue(isPrime(5))
        assertTrue(isPrime(11))
        assertFalse(isPrime(4))
        assertFalse(isPrime(9))
        assertFalse(isPrime(15))
        var count = 0
        for (n in 2..7919) {
            if (isPrime(n)) {
                count++
            }
        }
        assertEquals(1000, count)
        count = 0
        for (n in 2..1000000) {
            if (isPrime(n)) {
                count++
            }
        }
        assertEquals(78498, count)
    }
}