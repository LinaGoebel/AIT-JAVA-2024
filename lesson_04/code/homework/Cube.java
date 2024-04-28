package homework;

//Задача 1. Написать приложение, которое вычисляет объем куба по длине его ребра и площадь его
// поверхности с помощью метода.
public class Cube {

  public static void main(String[] args) {
    int length = 5;
    System.out.println("The volume of a cube = " + volumeOfCube(length) + " cubic centimeters " +
        " and its surface area = " + surfaceArea(length) + " square centimeters." );

  }
  public static int volumeOfCube(int a){
    return a * a * a;
  }
  public static int surfaceArea(int b){
    int faces = 6;
    return faces * (b * b);
  }
}


