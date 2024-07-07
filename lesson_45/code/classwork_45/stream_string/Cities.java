package classwork_45.stream_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cities {

  //Возьмите список городов, отфильтруйте только те названия, которые начинаются с заданной буквы,
  //преобразуйте их в верхний регистр и выведите в алфавитном порядке.
  public static void main(String[] args) {
    List<String> cityList = Arrays.asList("Augsburg", "Munich", "berlin", "Heidelberg", "Worms",
        "Frankfurt am Main", "Bremen", "Bonn", "Braunschweig");

    char firstLatter = 'B';

    List<String> result = filterCity(cityList, firstLatter);
    result.forEach(System.out::println);
  }

  private static List<String> filterCity(List<String> cityList, char firstLatter) {
    return cityList.stream()
        .filter(city -> city.toUpperCase().startsWith(String.valueOf(firstLatter)))
        .map(String::toUpperCase)
        .sorted()
        .collect(Collectors.toList());
  }

}
