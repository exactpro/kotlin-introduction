import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import java.io.File

class Test {
    @Test
    @Tag("Hard")
    fun alignFileByWidth() {
        alignFileByWidth("input/width_in1.txt", "temp.txt")
        assertFileContent(
            "temp.txt",
            """Простая

Во       входном       файле       с       именем       inputName       содержится       некоторый      текст.
Вывести   его  в  выходной  файл  с  именем  outputName,  выровняв  по  левому  и  правому  краю  относительно
самой                                              длинной                                             строки.
Выравнивание   производить,   вставляя  дополнительные  пробелы  между  словами:  равномерно  по  всей  строке

Слова     внутри     строки     отделяются     друг     от     друга     одним     или     более     пробелом.

Следующие                   правила                   должны                  быть                  выполнены:
1)     Каждая     строка     входного    и    выходного    файла    не    должна    заканчиваться    пробелом.
2) Пустые строки или строки из пробелов во входном файле должны превратиться в пустые строки в выходном файле.
3)   Число   строк   в   выходном  файле  должно  быть  равно  числу  строк  во  входном  (в  т.  ч.  пустых).

Равномерность              определяется              следующими             формальными             правилами:
1)  Число  пробелов  между  каждыми  двумя  парами  соседних  слов  не  должно  отличаться  более,  чем  на 1.
2)  Число  пробелов  между  более  левой  парой  соседних  слов  должно  быть  больше или равно числу пробелов
между                более               правой               парой               соседних               слов."""
        )
        File("temp.txt").delete()
    }

    private fun assertFileContent(name: String, expectedContent: String) {
        val file = File(name)
        val content = file.readLines().joinToString("\n")
        assertEquals(expectedContent, content)
    }
}