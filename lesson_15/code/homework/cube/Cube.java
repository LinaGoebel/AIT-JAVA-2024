package homework.cube;

//Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения
// периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class Cube {

  private double a;

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public Cube(double a) {
    this.a = a;
  }

  public void perimeter() {
    System.out.println("Perimeter = " + 12 * a);

  }

  public void area() {
    System.out.println("Area = " + (6 * (a * a)));
  }

  public void volume() {
    System.out.println("Volume = " + (a * a * a));
  }
}
