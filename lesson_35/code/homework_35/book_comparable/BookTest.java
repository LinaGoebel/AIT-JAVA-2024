package homework_35.book_comparable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

  Book[] books;

  @BeforeEach
  void setUp() {
    books = new Book[5];

    books[0] = new Book("E. Onegin", "Pushkin", 1980, 1000L);
    books[1] = new Book("E. Onegin", "Pushkin", 1915, 1015L);
    books[2] = new Book("War and Peace", "Tolstoj", 1990, 1002L);
    books[3] = new Book("Idiot", "Dostoevskij", 2000, 1004L);
    books[4] = new Book("Player", "Dostoevskij", 2005, 1005L);
  }

  private void printArray(Object[] arr, String reportTitel) {
    for (Object o : arr) {
      System.out.println(o);
    }
    System.out.println("-----------------");
  }

  @Test
  void testPrint() {
    printArray(books, "List of books");
  }

  @Test
  void testNativeSorting() {
    System.out.println("============Before sort name============");
    printArray(books, "List of books");
    System.out.println("============After sort name============");
    Arrays.sort(books);
    printArray(books, "List of books sorted by name");
  }

  @Test
  void testComparator() {
    Comparator<Book> comparator1 = (b1, b2) -> Integer.compare(b1.getYearOfPublishing(),
        b2.getYearOfPublishing());
    printArray(books, "List of books before sorting");
    System.out.println("==============Before sort year of publishing=============");
    Arrays.sort(books);
    printArray(books, "List of books after sorting by author");

    System.out.println("==============After sort year of publishing=============");
    Arrays.sort(books, comparator1);
    printArray(books, "List of books sorted by author");
  }
}