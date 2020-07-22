import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import java.io.File

class Test {
    @Test
    @Tag("Hard")
    fun markdownToHtmlSimple() {
        markdownToHtmlSimple("input/markdown_simple.md", "temp.html")
        checkHtmlSimpleExample()
    }

    private fun checkHtmlSimpleExample() {
        val result = File("temp.html").readText().replace(
            Regex("[\\s\\n\\t]"), ""
        )
        val expected =
            """
            <html>
                <body>
                    <p>
                        Lorem ipsum <i>dolor sit amet</i>, consectetur <b>adipiscing</b> elit.
                        Vestibulum lobortis. <s>Est vehicula rutrum <i>suscipit</i></s>, ipsum <s>lib</s>ero <i>placerat <b>tortor</b></i>.
                    </p>
                    <p>
                        Suspendisse <s>et elit in enim tempus iaculis</s>.
                    </p>
                </body>
            </html>
            """.trimIndent().replace(Regex("[\\s\\n\\t]"), "")
        assertEquals(expected, result)

        File("temp.html").delete()
    }
}