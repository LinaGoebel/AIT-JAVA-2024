package homework;
//Написать приложение, которое вычисляет площадь параллелограмма по его основанию и высоте с помощью метода.
public class Parallelogram {

  public static void main(String[] args) {
    int base = 8;
    int height = 6;
    System.out.println("The area of a parallelogram given its base and height = "
        + areaOfParallelogram(base, height) + " square centimeters.");

  }
  public static int areaOfParallelogram(int a, int b){
    return a * b;
  }

}
