package homework_36.birthday_formatter;
//Повторить пример TimeFormat со своим днем рождения.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class BirthdayTimeFormatter {

  public static void main(String[] args) {
    System.out.println("======My birthday ========");
    LocalDate myBirthday = LocalDate.of(1979, 3, 2);
    DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
    System.out.println(myBirthday.format(df));
    System.out.println("======My birthday in Locale.Germany========");
    df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.GERMANY);
    System.out.println(myBirthday.format(df));
    System.out.println("======parsing birthday from string======");
    String str = "02 03 1979";
    System.out.println(str);
    System.out.println("_____________________");
    LocalDate date = dateParser(str);
    System.out.println(date + " " + date.getDayOfWeek());
  }

  private static LocalDate dateParser(String date) {
    DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd MM yyyy][yyyy-MM-dd][dd/MM/yyyy]"
        + "[dd.MM.yyyy][dd-MM-yyyy]");
    return LocalDate.parse(date, df);
  }
}
