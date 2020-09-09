import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import java.io.File

class Test {
    @Test
    @Tag("Hard")
    fun markdownToHtmlLists() {
        markdownToHtmlLists("input/markdown_lists.md", "temp.html")
        checkHtmlListsExample()
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