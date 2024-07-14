package classwork_47.library.dao;

import classwork_47.library.model.Author;
import classwork_47.library.model.Book;
import java.util.HashSet;
import java.util.Set;

public class LibraryImpl implements Library {

  Set<Book> books = new HashSet<>();
  int quantity = 0;

  public LibraryImpl(int capacity) {
    this.books = new HashSet<>(capacity);
    // capacity - ???
  }

  @Override
  public boolean addBook(Book book) {
    if (book == null) {
      return false;
    }
    if (books.contains(book)) {
      return false;
    }
    // TODO check for capacity

    quantity++;

    books.add(book);
    return true;
  }

  @Override
  public Book findBookByAuthor(Author author) {
    return books.stream()
        .filter(book -> book.getAuthor().equals(author))
        .findFirst()
        .orElse(null);
  }

  @Override
  public Book findBookByIsbn(String isbn) {
    return books.stream()
        .filter(book -> book.getAuthor().equals(isbn))
        .findFirst()
        .orElse(null);
  }

  @Override
  public boolean rentBook(String isbn) {
    // find book

    //set isRented = true
    return true;
  }

  @Override
  public boolean getBackBook(String isbn) {
    // find book

    //set isRented = true
    return true;
  }

  @Override
  public int quantity() {
    return books.size();
  }
}