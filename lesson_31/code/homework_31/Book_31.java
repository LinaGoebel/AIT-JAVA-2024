package homework_31;

import classwork.library.model.Book;
import java.util.Objects;

public class Book_31 {

  private static final int ISBN_LENGTH = 13;

  private String title;
  private String author;
  private int yearOfPublishing;
  private long isbn;

  public Book_31(String title, String author, int yearOfPublishing, long isbn) {
    this.title = title;
    this.author = author;
    this.yearOfPublishing = yearOfPublishing;
    this.isbn = checkIsbn(isbn);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getYearOfPublishing() {
    return yearOfPublishing;
  }

  public void setYearOfPublishing(int yearOfPublishing) {
    this.yearOfPublishing = yearOfPublishing;
  }

  public long getIsbn() {
    return isbn;
  }

  public void setIsbn(long isbn) {
    this.isbn = checkIsbn(isbn);
  }

  private long checkIsbn(long isbn) {
    if (countDigits(isbn) == ISBN_LENGTH) {
      return isbn;
    }
    return -1;
  }

  private int countDigits(long isbn) {
    int count = 0;
    do {
      count++;
      isbn /= 10;
    } while (isbn != 0);
    return count;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Book");
    sb.append("titel = ").append(title);
    sb.append(", author: ").append(author);
    sb.append(", year of publishing: ").append(yearOfPublishing);
    sb.append(", isbn: ").append(isbn);
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Book_31)) {
      return false;
    }
    Book_31 book31 = (Book_31) o;
    return isbn == book31.isbn;
  }

  @Override
  public int hashCode() {
    return Objects.hash(isbn);
  }
}



