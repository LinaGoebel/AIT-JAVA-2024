package homework;

import java.awt.Color;

//Напечатайте на экране шахматную доску размером 8х8. 0 - белая клеточка, 1 - черная.
// Левая верхняя клеточка должна быть 0, левая нижняя - 1.
public class Chessboard {

  public static void main(String[] args) {
    int a = 0;
    int b = 0;

    while (a < 8) {
      while (b < 8) {
        System.out.print((a + b) % 2 + "|");
        b++;
      }
      System.out.println();
      b = 0;
      a++;
    }
  }
}
