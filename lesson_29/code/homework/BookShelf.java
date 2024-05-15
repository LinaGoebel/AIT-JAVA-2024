package homework;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {

  private List<Book> books = new ArrayList<>();

  static class Book {

    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
      this.title = title;
      this.author = author;
      this.year = year;
    }

    @Override
    public String toString() {
      return title + " by " + author + ", " + year + "\n ";
    }
  }

  @Override
  public String toString() {
    return "BookShelf{" +
        "books=\n" + books +
        '}';
  }

  void addBook(String title, String author, int year) {
    this.books.add(new Book(title, author, year));
  }

  class Iterator {

    private int cursor = 0;

    public Book nextBook() {

      Book book = books.get(cursor);
      cursor += 1;
      if (cursor >= books.size()) {
        cursor = 0;
      }
      return book;
    }

    @Override
    public String toString() {
      return "Iterator{" +
          "cursor=" + cursor +
          '}';
    }
  }
}
