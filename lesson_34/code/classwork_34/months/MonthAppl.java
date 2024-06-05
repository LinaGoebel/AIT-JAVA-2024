package classwork_34.months;

public class MonthAppl {

  public static void main(String[] args) {
    Months month = Months.JUN;
    System.out.println(month);

    Months newMonth = month.plusMonth(2);
    System.out.println(newMonth);

    newMonth = month.plusMonth(-5);
    System.out.println(newMonth);
  }

}
