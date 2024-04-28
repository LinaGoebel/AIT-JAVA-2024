package homework.book;

import homework.book.model.Book;

//Создать класс BookAppl в пакете ait.book с методом main. В методе main создать несколько
// экземпляров Book и вывести для каждого из них результат работы метода display.
public class BookAppl {

  public static void main(String[] args) {
    Book book1 = new Book(98711555, "The Master and Margarita", "Mikhail Bulgakov",
        1967);
    Book book2 = new Book(58974123, "Secrets of History", 1912);
    Book book3 = new Book(78945128, "Say 'YES' to life!", "Viktor Frankl ", 2018);

    book1.display();
    book2.display("unknown");
    book3.display();
  }

}
