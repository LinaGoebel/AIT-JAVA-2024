package homework;

//В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 %
// от предыдущего значения. Определите номер того дня, на который пробег спортсмена составит
// не менее target километров. Программа получает на вход действительные числа s и target и должна
// вывести одно натуральное число.
public class Athlete {

  public static void main(String[] args) {
    double beginning = 5;
    double target = 10;
    int day = 0;

    while (beginning < target) {
      beginning *= 1.1;
      day++;
    }
    System.out.println("To reach his goal, the athlete will need " + day + " days.");
  }
}
