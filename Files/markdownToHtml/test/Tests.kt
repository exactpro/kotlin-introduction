import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import java.io.File

class Test {
    @Test
    @Tag("Impossible")
    fun markdownToHtml() {
        markdownToHtml("input/markdown_simple.md", "temp.html")
        checkHtmlSimpleExample()

        markdownToHtml("input/markdown_lists.md", "temp.html")
        checkHtmlListsExample()
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

    private fun checkHtmlListsExample() {
        val result = File("temp.html").readText().replace(
            Regex("[\\s\\n\\t]"), ""
        )
        val expected =
            """
            <html>
              <body>
                <ul>
                  <li>
                    Утка по-пекински
                    <ul>
                      <li>Утка</li>
                      <li>Соус</li>
                    </ul>
                  </li>
                  <li>
                    Салат Оливье
                    <ol>
                      <li>Мясо
                        <ul>
                          <li>
                              Или колбаса
                          </li>
                        </ul>
                      </li>
                      <li>Майонез</li>
                      <li>Картофель</li>
                      <li>Что-то там ещё</li>
                    </ol>
                  </li>
                  <li>Помидоры</li>
                  <li>
                    Фрукты
                    <ol>
                      <li>Бананы</li>
                      <li>
                        Яблоки
                        <ol>
                          <li>Красные</li>
                          <li>Зелёные</li>
                        </ol>
                      </li>
                    </ol>
                  </li>
                </ul>
              </body>
            </html>
            """.trimIndent().replace(Regex("[\\s\\n\\t]"), "")
        assertEquals(expected, result)

        File("temp.html").delete()
    }
}