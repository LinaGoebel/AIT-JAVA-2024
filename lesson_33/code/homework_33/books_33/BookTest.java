package homework_33.books_33;

import static org.junit.jupiter.api.Assertions.*;

import homework_31.Book_31;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

  Book[] books;

  @BeforeEach
  void setUp() {
    books = new Book[5];
    books[0] = new Book("E. Onegin", "Pushkin", 1980, 1200000000000L);
    books[1] = new Book("Отцы и дети", "Tyrgenev", 1985, 1300000000001L);
    books[2] = new Book("Война и мир", "Tolstoj", 1990, 1400000000002L);
    books[3] = new Book("Идиот", "Dostoevskij", 2000, 1500000000003L);
    books[4] = new Book("English", "Bonk", 2000, 1600000000004L);
  }

  @Test
  void testBookSort() {
    System.out.println("============Before sort author============");
    printArray(books);
    Arrays.sort(books);
    System.out.println("============After sort author============");
    printArray(books);
  }

  @Test
  void testBookComparator() {
    Comparator<Book> bookComparator = new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return (o1.getYearOfPublishing() - o2.getYearOfPublishing());
      }
    };
    System.out.println("============Before sort year of publishing============");
    printArray(books);
    Arrays.sort(books, bookComparator);
    System.out.println("============After sort year of publishing============");
    printArray(books);
  }
  public void printArray(Object[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print("\t" + arr[i] + "\n ");
    }
    System.out.println();
  }
}