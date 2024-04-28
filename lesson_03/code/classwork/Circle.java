package classwork;

//Вычислить длину окружности по ее радиусу (задается в программе).
public class Circle {

  public static void main(String[] args) {
    double constanta = pi();
    System.out.println(constanta);

    printPi(constanta);
    double r = 100;
    double res = circleLenght(r);

    System.out.println("L = " + res);
  }

  private static double circleLenght(double radius) {
    double l = 2 * pi() * radius;
    return l;
  }

  private static void printPi(double p) {
    System.out.println("Pi = " + p);
  }

  private static double pi() {
    double p = 3.1415926536;
    return p;
  }

}
