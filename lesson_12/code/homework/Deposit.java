package homework;
//В сберкассу на трёхпроцентный вклад положили s рублей. Какой станет сумма вклада через n лет.
public class Deposit {

  public static void main(String[] args) {
    double savings = 12;
    int years = 7;
    double percent = 0.03;
    double sum = 0;
    int count = 1;

    while ( count <= years){
      sum += sum + (savings * percent);
      count++;
    }
    System.out.printf("The deposit amount: %.2f", sum );
  }
}
