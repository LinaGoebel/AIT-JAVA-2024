package homework_31;

public interface Library {

  boolean addBook(Book_31 book);

  Book_31 remove(long isbn);

  Book_31 findBook(long isbn);

  int quantity();

  void printBook();

}
