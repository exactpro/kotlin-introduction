import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Test {
    @Test
    @Tag("Impossible")
    fun computeDeviceCells() {
        assertEquals(
            listOf(0, 0, 0, 0, 0, 1, 1, 1, 1, 1),
            computeDeviceCells(10, "+>+>+>+>+", 10000)
        )
        assertEquals(
            listOf(-1, -1, -1, -1, -1, 0, 0, 0, 0, 0),
            computeDeviceCells(10, "<-<-<-<-<-", 10000)
        )
        assertEquals(
            listOf(1, 1, 1, 1, 1, 0, 0, 0, 0, 0),
            computeDeviceCells(10, "- <<<<< +[>+]", 10000)
        )
        assertEquals(
            listOf(0, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0),
            computeDeviceCells(
                11,
                "<<<<< + >>>>>>>>>> --[<-] >+[>+] >++[--< <[<] >+[>+] >++]",
                10000
            )
        )

        assertEquals(
            listOf(0, 0, 0, 0, 0, 1, 1, 0, 0, 0),
            computeDeviceCells(10, "+>+>+>+>+", 4)
        )
        assertEquals(
            listOf(0, 0, -1, -1, -1, 0, 0, 0, 0, 0),
            computeDeviceCells(10, "<-<-<-<-<-", 6)
        )
        assertEquals(
            listOf(1, 1, 1, 0, 0, -1, 0, 0, 0, 0),
            computeDeviceCells(10, "- <<<<< +[>+]", 17)
        )
        assertEquals(
            listOf(0, 6, 5, 4, 3, 2, 1, 0, -1, -1, -2),
            computeDeviceCells(
                11,
                "<<<<< + >>>>>>>>>> --[<-] >+[>+] >++[--< <[<] >+[>+] >++]",
                256
            )
        )
        assertThrows(IllegalArgumentException::class.java) {
            computeDeviceCells(10, "===", 3)
        }
        assertThrows(IllegalArgumentException::class.java) {
            computeDeviceCells(10, "+>+>[+>", 3)
        }
        assertThrows(IllegalStateException::class.java) {
            computeDeviceCells(20, ">>>>>>>>>>>>>", 12)
        }
    }
}