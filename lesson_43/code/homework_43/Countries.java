package homework_43;
//Соберите в структуру Map порядка 20 стран, по несколько страны из разных континентов Земли.
// Подсчитайте количество стран на континентах из полученного списка.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Countries {

  public static void main(String[] args) {
    Map<String, String> countries = new HashMap<>();
    countries.put("Germany", "Europe");
    countries.put("France", "Europe");
    countries.put("Spain", "Europe");
    countries.put("Russia", "Asia");
    countries.put("Kazakhstan", "Asia");
    countries.put("China", "Asia");
    countries.put("India", "Asia");
    countries.put("Japan", "Asia");
    countries.put("Nigeria", "Africa");
    countries.put("Egypt", "Africa");
    countries.put("South Africa", "Africa");
    countries.put("United States", "North America");
    countries.put("Canada", "North America");
    countries.put("Mexico", "North America");
    countries.put("Brazil", "South America");
    countries.put("Argentina", "South America");
    countries.put("Chile", "South America");
    countries.put("Australia", "Oceania");
    countries.put("New Zealand", "Oceania");
    countries.put("Papua New Guinea", "Oceania");

    System.out.println(countries.size());

    int europe = 0;
    for (String name : countries.keySet()) {
      if (countries.get(name).equals("Europe")) {
        europe++;
      }
    }
    System.out.println("Countries in europe = " + europe);

    int asia = 0;
    for (String name : countries.values()) {
      if (name.equals("Asia")) {
        asia++;
      }
    }
    System.out.println("Countries in asia = " + asia);

    int africa = 0;
    for (String name : countries.keySet()) {
      if (countries.get(name).equals("Africa")) {
        africa++;
      }
    }
    System.out.println("Countries in africa = " + africa);

    int northAmerica = 0;
    for (String name : countries.values()) {
      if (name.equals("North America")) {
        northAmerica++;
      }
    }
    System.out.println("Countries in North America = " + northAmerica);

    int southAmerica = 0;
    for (String name : countries.values()) {
      if (name.equals("South America")) {
        southAmerica++;
      }
    }
    System.out.println("Countries in South America = " + southAmerica);

    int oceania = 0;
    for (String name : countries.keySet()) {
      if (countries.get(name).equals("Oceania")) {
        oceania++;
      }
    }
    System.out.println("Countries in Oceania = " + oceania);

    Set<String> keys = countries.keySet();
    for (String str : keys) {
      System.out.println("Country: " + str);
    }

    List<String> countryList = new ArrayList<>(countries.keySet());
    Collections.sort(countryList);
    for (String str : countryList) {
      System.out.println("Continent: " + str);
    }
  }
}
