package classwork_35;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

//Работа с датами:
//
//узнать текущую дату и время
//есть дата, какой это был день недели? день месяца? день года?
//есть дата, как узнать, это было раньше? или позже?
//Путешествие во времени
//
//в будущее currentDay.plus
//в прошлое currentDay.minus
//использование ChronoUnit
//Получение интервала времени
//
//Сортировка массива по времени
//
//Date Formatter
//
//Парсинг даты из строки
public class TimeApiAppl {

  public static void main(String[] args) {
    LocalDate currentDay = LocalDate.now();
    System.out.println(currentDay);

    LocalTime currentTime = LocalTime.now();
    System.out.println(currentTime);

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);
    System.out.println("_____________________________");

    LocalDate gagarinStart = LocalDate.of(1961, 04, 12);
    System.out.println(gagarinStart.getYear());
    System.out.println(gagarinStart.getDayOfYear());
    System.out.println(gagarinStart.getDayOfWeek());
    System.out.println("_____________________________");

    System.out.println(gagarinStart.isAfter(currentDay));
    System.out.println(gagarinStart.isBefore(currentDay));

    System.out.println("__________+ 50 days___________________");
    LocalDate newDate = currentDay.plusDays(50);
    System.out.println(newDate);

    System.out.println("__________+ 12 weeks___________________");
    LocalDate newDate2 = currentDay.plusWeeks(12);
    System.out.println(newDate2);

    System.out.println("__________- 2 months___________________");
    newDate = currentDay.minusMonths(2);
    System.out.println(newDate);

    //использование ChronoUnit
    LocalDateTime newDateTime = localDateTime.plus(9, ChronoUnit.HALF_DAYS);
    System.out.println(newDateTime);
    System.out.println("-----------------------------");
    newDate = currentDay.plus(2, ChronoUnit.CENTURIES);
    System.out.println(newDate);

    System.out.println("-----------------------------");
    LocalDate einstein = LocalDate.of(1879, 3, 14);
    System.out.println(einstein);
    System.out.println("_____________________________");
    long res = ChronoUnit.YEARS.between(gagarinStart, einstein);
    System.out.println(res);
    System.out.println("_____________________________");
    System.out.println(einstein.compareTo(gagarinStart));

    System.out.println("------------Sorting array with time");
    LocalDate yesterday = LocalDate.of(2024, 06, 06);
    LocalDate[] dates = {currentDay, gagarinStart, einstein, yesterday};
    System.out.println(Arrays.toString(dates));
    Arrays.sort(dates);
    System.out.println(Arrays.toString(dates));

    System.out.println("------------Date Formatter");
    System.out.println(currentDay.format(java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy")));
  }
}
