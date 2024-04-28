package classwork;
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".
public class RocketStart {

  public static void main(String[] args) {
    int countDown = 10;
    System.out.println("There are: " + countDown + " to start.");

    while (countDown > 0){
      countDown--;//countDown = countDown -1
      System.out.println("There are: " + countDown + " to start.");
    }
    System.out.println("Go!...");
  }

}
