package classwork_43.map_introduction;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntroAppl {

  public static void main(String[] args) {
    Map<String, Integer> usaCities = new TreeMap<>();//create Object, type of object - TreeMap
    usaCities.put("Denver", 600_000);
    usaCities.put("Boston", 670_000);
    usaCities.put("Chicago", 2_700_000);
    usaCities.put("Atlanta", 470_000);
    usaCities.put("New York", 8_500_000);
    usaCities.put("Dallas", 1_300_000);
    usaCities.replace("Dallas", 1_300_010);//update
    //map size
    System.out.println(usaCities.size());
    System.out.println(usaCities.isEmpty());//false

    int population = usaCities.get("Chicago");
    System.out.println("Population of Chicago: " + population);
    int population1 = usaCities.get("Boston");
    System.out.println("Population of Boston: " + population1);

    //check key
    System.out.println(usaCities.containsKey("Atlanta"));
    //1st approach
    Collection<Integer> totalPopulation = usaCities.values();//create new object
    int total = 0;

    for (Integer i : totalPopulation) {
      total += i;
    }
    System.out.println("Total Population in cities: " + total);
    //2n approach
    Set<String> setOfCities = usaCities.keySet();
    total = 0;
    for (String str : setOfCities) {
      total += usaCities.get(str);
    }
    System.out.println("Total Population in cities: " + total);

    System.out.println("===========Print Map=============");
    Set<String> keys = usaCities.keySet();
    for (String str : keys) {
      System.out.println(str + " name of city");
    }
    System.out.println("=============================");
    //print map using Entry
    Set<Map.Entry<String, Integer>> entries = usaCities.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }
    //print map another time
    System.out.println(usaCities.entrySet());
  }
}
