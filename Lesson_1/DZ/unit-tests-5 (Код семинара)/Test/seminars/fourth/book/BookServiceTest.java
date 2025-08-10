package seminars.fourth.book;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    @Test
    public void testFindBookById() {
        // создаем мок-объект для BookRepository
        BookRepository mockRepository = mock(BookRepository.class);

        // настраиваем мок-объект
        when(mockRepository.findById("123")).thenReturn(new Book("123", "Test Book", "Test Author"));

        // создаем объект BookService и передаем ему мок-объект
        BookService bookService = new BookService(mockRepository);

        // вызываем тестируемый метод
        Book result = bookService.findBookById("123");

        // проверяем результат
        assertEquals("Test Book", result.getTitle());
        assertEquals("Test Author", result.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        // создаем мок-объект для BookRepository
        BookRepository mockRepository = mock(BookRepository.class);

        // настраиваем мок-объект
        when(mockRepository.findAll()).thenReturn(List.of(new Book("123", "Test Book", "Test Author")));

        // создаем объект BookService и передаем ему мок-объект
        BookService bookService = new BookService(mockRepository);

        // вызываем тестируемый метод
        List<Book> result = bookService.findAllBooks();

        // проверяем результат
        assertEquals(1, result.size());
        assertEquals("Test Book", result.get(0).getTitle());
        assertEquals("Test Author", result.get(0).getAuthor());
    }
}

// 1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
// - Тестовые заглушки нужны для изоляции тестируемого модуля, устранения зависимости от внешних систем и
// обеспечения предсказуемых результатов.

//2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными
// аргументами?
//Для проверки вызова с определенными аргументами используют мок-объекты.

//3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или
// исключение в ответ на вызов метода?
//Для возврата определенного значения или исключения используют стабы.

//4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?
//Для имитации взаимодействия с внешним API или базой данных используют моки или фейки.