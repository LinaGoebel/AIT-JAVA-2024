package classwork;
//Вычислить площадь прямоугольника.
// Задайте длину и ширину прямоугольника как переменные типа double.
public class Rectangle {

  public static void main(String[] args) {

    double a = 123.5;
    double b = 34.7;

    double area = a * b;

    System.out.println("Area of rectangle width = " + a + " height = " + b + " = " + area);

    double res = areaOfRectangle(a, b);
    System.out.println("Area = " + res);
  }

  private static double areaOfRectangle(double a, double b) {
    return a * b;
  }

}
