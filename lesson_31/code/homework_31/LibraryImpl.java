package homework_31;

import classwork.library.model.Book;

public class LibraryImpl implements Library {

  private Book_31[] book;
  private int size;

  public LibraryImpl(int capacity) {
    book = new Book_31[capacity];
  }

  @Override
  public boolean addBook(Book_31 book) {
    if (size >= this.book.length || book == null) {
      return false;
    }
    Book_31 found = findBook(book.getIsbn());
    if (found != null) {
      return false;
    }
    this.book[size] = book;
    size++;
    return true;
  }

  @Override
  public Book_31 remove(long isbn) {
    Book_31 victim = null;
    for (int i = 0; i < size; i++) {
      if (book[i].getIsbn() == isbn) {
        victim = book[i];
        book[i] = book[size - 1];
        book[size - 1] = null;
        size--;
        break;
      }
    }
    return victim;
  }

  @Override
  public Book_31 findBook(long isbn) {
    for (int i = 0; i < size; i++) {
      if (book[i].getIsbn() == isbn) {
        return book[i];
      }
    }
    return null;
  }

  @Override
  public int quantity() {
    return size;
  }

  @Override
  public void printBook() {
    for (int i = 0; i < size; i++) {
      System.out.println(book[i]);
    }
    System.out.println("==========================================");
  }
}