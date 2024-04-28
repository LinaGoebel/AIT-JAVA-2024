package homework;
//Распечатайте все натуральные числа меньшие 200 и кратные 13.
public class NaturalNumbers {

  public static void main(String[] args) {
    int num = 1;

    while (num <= 200){
      if(num % 13 == 0){
        System.out.print(" | " + num);
      }
      num++;
    }
  }

}
