package classwork.library;

import classwork.library.controller.Library;
import classwork.library.model.Book;

public class LibraryAppl {

  public static void main(String[] args) {
    Library library = new Library(1000);

    library.addBook(new Book("Война и мир", "Л.Н.Толстой", 2020, 1000000000000L));
    library.addBook(new Book("Title1", "Author1", 2021, 2000000000000L));
    library.addBook(new Book("Title2", "Author2", 2023, 3000000000000L));

    System.out.println(library.getSize());

    library.addBook(new Book("Title3", "Author3", 2020, 3000000000000L));

    System.out.println(library.getSize());

    library.printBooks();
    library.addBook(new Book("Title4", "Author4", 2024, 4000000000000L));

    library.printBooks();

    library.removeBook(4000000000000L);// remove
    System.out.println(library.getSize());
    library.printBooks();

    library.removeBook(1000000000000L);
    System.out.println(library.getSize());
    library.printBooks();

  }
}