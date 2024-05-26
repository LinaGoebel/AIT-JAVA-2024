package homework_31;

import static org.junit.jupiter.api.Assertions.*;

import homework.book.Book;
import homework.book.Dictionary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryImplTest {

  Library library;
  Book_31[] book;

  @BeforeEach
  void setUp() {
    library = new LibraryImpl(6); // Увеличьте емкость до 6
    book = new Book_31[5];
    book[0] = new Book_31("E. Onegin", "Pushkin", 1980, 1200000000000L);
    book[1] = new Book_31("Отцы и дети", "Тургенев", 1985, 1300000000001L);
    book[2] = new Book_31("Война и мир", "Толстой", 1990, 1400000000002L);
    book[3] = new Book_31("Идиот", "Достоевский", 2000, 1500000000003L);
    book[4] = new Book_31("English", "Bonk", 2000, 1600000000004L);

    for (int i = 0; i < book.length; i++) {
      library.addBook(book[i]);
    }
  }

  @Test
  void addBook() {
    assertFalse(library.addBook(null));// нельзя добавить null
    assertFalse(library.addBook(book[1]));// нельзя добавить второй раз уже имеющегося
    Book_31 newBook = new Book_31("German", "Frank", 2005, 1000000000005L);
    assertTrue(library.addBook(newBook));// проверяем кол-во после добавления
    assertEquals(6, library.quantity()); // нельзя превысить capacity
    Book_31 book2 = new Book_31("French", "Balsak", 2010, 1000000000006L);
    assertFalse(library.addBook(book2));
    library.printBook();

  }


  @Test
  void remove() {
    assertEquals(book[0], library.remove(1200000000000L));
    System.out.println("remove " + book[0]);
    assertNull(library.remove(1200000000000L));
  }

  @Test
  void findBook() {
    assertEquals(book[3], library.findBook(1500000000003L));
    System.out.println("find Book " + book[3]);
    assertNull(library.findBook(1990000000003L));
  }

  @Test
  void quantity() {
    assertEquals(5, library.quantity());
    System.out.println("quantity book = " + library.quantity());
  }

}