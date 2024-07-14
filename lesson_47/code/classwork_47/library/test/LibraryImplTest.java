package classwork_47.library.test;

import static org.junit.jupiter.api.Assertions.*;

import classwork_47.library.dao.Library;
import classwork_47.library.dao.LibraryImpl;
import classwork_47.library.model.Author;
import classwork_47.library.model.Book;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryImplTest {

  Library library;
  private Book[] books = new Book[5];
  private Author[] authors = new Author[5];

  @BeforeEach
  void setUp() {
    library = new LibraryImpl(6);
    Book[] books = new Book[5];
    Author[] authors = new Author[5];

    authors = new Author[]{
        new Author("Лев", "Толстой", LocalDate.parse("1828-09-09"), "Россия", 10),
        new Author("Фёдор", "Достоевский", LocalDate.parse("1821-11-11"), "Россия", 10)
    };
    books = new Book[]{
        new Book("ISBN001", "Война и мир", authors[0], 1869, false),
        new Book("ISBN002", "Анна Каренина", authors[0], 1877, true),
        new Book("ISBN003", "Преступление и наказание", authors[1], 1866, false),
        new Book("ISBN004", "Идиот", authors[1], 1869, false),
        new Book("ISBN005", "Бесы", authors[1], 1872, true)
    };

    // Добавление книг в библиотеку
    for (Book book : books) {
      library.addBook(book);
    }

  }

  @Test
  void addBook() {
    assertFalse(library.addBook(null));
    //Author author = new Author("Лев", "Толстой", LocalDate.parse("1828-09-09"), "Россия", 10);
    Book newBook = new Book("ISBN006", "Братья Карамазовы", authors[1], 1880, false);
    assertTrue(library.addBook(newBook)); // add new
    assertEquals(6, library.quantity()); // the quantity remains the same
  }

  @Test
  void findBookByAuthor() {
    // Проверяем поиск книги по автору Лев Толстой
    Book expectedBook = books[1]; // "Война и мир"
    Book foundBook = library.findBookByAuthor(authors[0]);
    assertEquals(expectedBook, foundBook);

    // Проверяем поиск книги по автору Фёдор Достоевский
    expectedBook = books[0]; // "Преступление и наказание"
    foundBook = library.findBookByAuthor(authors[0]);
    assertEquals(expectedBook, foundBook);
  }

  @Test
  void findBookByIsbn() {
    // Проверяем поиск книги по ISBN
    Book expectedBook = books[1]; // "Анна Каренина"
    Book foundBook = library.findBookByIsbn("ISBN002");
    assertEquals(expectedBook, foundBook);
  }

  @Test
  void rentBook() {

  }

  @Test
  void getBackBook() {

  }

  @Test
  void quantity() {
    // Проверяем количество книг в библиотеке
    assertEquals(5, library.quantity());
  }
}