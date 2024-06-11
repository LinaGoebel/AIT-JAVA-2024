package classwork_36.date_time_formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DayTimeFormatter {
  public static void main(String[] args) {

    LocalDate gagarinStart = LocalDate.of(1961, 04,12);
    DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
    System.out.println(gagarinStart.format(df));
    System.out.println("----------------");
    df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH);
    System.out.println(gagarinStart.format(df));
    System.out.println("===========parsing date from string==========");
    String str = "10 06 2024";
    System.out.println(str);
    System.out.println("_____________________");
    LocalDate date = dateParser(str);// method call from String to LocalDate
    System.out.println(date + " " + date.getDayOfWeek());
  }

  private static LocalDate dateParser(String date) {
    DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd MMMM yyyy][yyyy-MM-dd][dd/MM/yyyy][dd.MM.yyyy][dd-MM-yyyy]");
    return LocalDate.parse(date, df);

  }

}
