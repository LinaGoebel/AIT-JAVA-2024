package homework;

//Площадь треугольника по стороне и высоте треугольника.
//Гипотенузу по двум катетам (теорема Пифагора).
//Величину 3-го угла треугольника по известным первым двум.
public class CalculatingVarious_2 {

  public static void main(String[] args) {

    double length = 15;
    double altitude = 7;
    double res = areaOfTriangle(length, altitude);
    System.out.println("Area of a triangle by side and altitude of the triangle = " + res);

    double lengthCathA = 3.5;
    double lengthCathB = 4.5;
    double resHup = hypotenuse(lengthCathA, lengthCathB);
    System.out.println("Hypotenuse by two cathetes = " + resHup);

    int angleA = 50;
    int angleB = 90;
    int value = valueOfangle(angleA, angleB);
    System.out.println("The value of the 3rd angle of the triangle = " + value);

  }

  private static double areaOfTriangle(double length, double altitude) {
    return 0.5 * length * altitude;
  }

  private static double hypotenuse(double a, double b) {
    double c = (a * a) + (b * b);
    return Math.sqrt(c);
  }

  private static int valueOfangle(int a, int b) {
    int sumAngles = 180;
    return sumAngles - a - b;

  }

}
