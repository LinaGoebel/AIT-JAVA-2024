package classwork;

import java.util.Scanner;

//Пользователь вводит с клавиатуры строку. Распечатайте каждую букву строки на новой строчке.
// Используйте методы length и charAt() класса String.
public class LetterInString {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input string: ");

    String str = scanner.nextLine();
    int l = str.length();
    int count = 0;

    while (count < l) {
      System.out.println(str.charAt(count));
      count++;
    }
  }
}
