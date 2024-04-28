package homework;

//Метод вычисляющий площадь круга;
//Метод вычисляющий площадь квадрата;
//Метод вычисляющий площадь прямоугольника (чуть сложнее чем 1. и 2.);
//В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль.
public class CalculatingVarious {

  public static void main(String[] args) {

    System.out.println("Circle area = " + circleArea(14));

    System.out.println("Square area = " + squareArea(55));

    System.out.println("The area of a rectangle = " + areaOfRectangle(12, 59));

  }

  private static double circleArea(double radius) {
    return Math.PI * (radius * radius);
  }

  private static int squareArea(int sideLength) {
    return sideLength * sideLength;
  }

  private static int areaOfRectangle(int length, int width) {
    return length * width;
  }
}
