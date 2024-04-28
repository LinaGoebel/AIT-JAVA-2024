package homework;

// Написать программу, определяющую, является ли год високосным. Для того чтобы год был високосным,
// он должен: делится без остатка на 4 и, либо не должен делится без остатка на 100, либо если он
// делится на 100, то он должен делится также на 400. Проверить на годах 1700, 1800, 1900 -
// не високосные, а 2000 високосный.
public class LeapYear {

  public static void main(String[] args) {
    int a = 2023;

    if (a % 4 == 0) {
      if (a % 100 == 0) {
        if (a % 400 == 0) {
          System.out.println("Leap year");
        } else {
          System.out.println("Non - leap year");
        }
      } else {
        System.out.println("Leap year");
      }
    } else {
      System.out.println("Non - leap year");
    }
  }
}
