package homework;

//Разработать аппликацию для решения квадратного уравнения по коэффициентам квадратного
// трехчлена а, b и с. Дискриминант вычислить по формуле: d = bb - 4ac Если d > 0 ,
// то x1 = (-b + Math.sqrt(d))/(2a), x2 = (-b - Math.sqrt(d))/(2a). Если d = 0, то x = -b / (2a).
// Если d < 0, то сообщить, что корней нет.
public class QuadraticEquation {

  public static void main(String[] args) {
    int a = 4;
    int b = 6;
    int c = 3;

    int d = b * b - 4 * a * c;
    if (d > 0) {
      System.out.println("x1 = " + (-b + Math.sqrt(d) / (2 * a)));
      System.out.println("x2 = " + (-b - Math.sqrt(d)) / (2 * a));
    }
    if (d == 0) {
      System.out.println("x = " + (-b / (2 * a)));
    }
    if (d < 0) {
      System.out.println("No roots.");
      {

      }
    }
  }
}
