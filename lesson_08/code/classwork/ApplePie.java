package classwork;

//Задача о яблоках (начальное значение 30 яблок). Запустить цикл, в котором яблоки берутся из
// корзины до тех пор, пока они там есть. Последнее сообщение: "Яблоки кончились!".
public class ApplePie {

  public static void main(String[] args) {
    int apples = 30;
    int counter = 0;
    int applesInBasket = apples;

    while (applesInBasket > 0) {
      //cycle body
      System.out.println("Take one apple from basket.");
      applesInBasket = applesInBasket - 1;
      System.out.println("We have apples " + applesInBasket + " now.");
      counter++;
    }
    System.out.println("The job is done. Total apples " + counter + " added in pie.");
  }
}
