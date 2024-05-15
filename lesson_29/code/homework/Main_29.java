package homework;

import homework.BookShelf.Book;
import homework.BookShelf.Iterator;

public class Main_29 {
  public static void main(String[] args) {

    BookShelf bookShelf = new BookShelf();
    bookShelf.addBook("Война и мир", "Лев Толстой", 2024);
    bookShelf.addBook("Три мушкетера", "Дюма А.", 2023);
    bookShelf.addBook("Мастер и Маргарита", "Мастер и Маргарита", 1984);
    bookShelf.addBook("Сердца трех", "Лондон Д.", 2015);

    System.out.println(bookShelf);
    System.out.println("--------------------------------------------------");

    BookShelf.Iterator iterator = bookShelf.new Iterator();
    Book book1 = iterator.nextBook();
    Book book2 = iterator.nextBook();
    Book book3 = iterator.nextBook();
    Book book4 = iterator.nextBook();
    Book book5 = iterator.nextBook();

    System.out.println(book2);
  }
}



