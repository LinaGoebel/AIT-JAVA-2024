package homework;

//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.
public class DayTimeTemperatures {

  public static void main(String[] args) {
    int[] temperatures = {12, 9, 10, 11, 12, 14, 16};
    System.out.printf("The temperature that was  on Tuesday %d degrees Celsius and on Thursday %d"
            + " degrees Celsius",
        temperatures[1], temperatures[3]);

    System.out.println();

    int sum = 0;

    for (int i = 0; i < temperatures.length; i++) {
      sum += temperatures[i];
    }
    int averageTemperatures = sum / temperatures.length;
    System.out.printf("The average temperature for the past week: %d degrees Celsius.",
        averageTemperatures);
  }
}
