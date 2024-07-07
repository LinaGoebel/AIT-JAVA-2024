package classwork_43.map_introduction;

import java.util.HashMap;
import java.util.Map;

public class MenAndWomen {

  public static void main(String[] args) {
    System.out.println("List of group with gender:");
    Map<String, String> groupGender = new HashMap<>();
    groupGender.put("Leonid", "Male");
    groupGender.put("Paul", "Male");
    groupGender.put("Alexander", "Male");
    groupGender.put("Roman", "Male");
    groupGender.put("Victoria D", "Female");
    groupGender.put("Victoria K", "Female");
    groupGender.put("Julia", "Female");
    groupGender.put("Lina", "Female");
    groupGender.put("Helena", "Female");

    System.out.println(groupGender.size());

    int women = 0;
    for (String name : groupGender.keySet()) {
      if (groupGender.get(name).equals("Female")) {
        women++;
      }
    }
    System.out.println("Women = " + women);

    int men = 0;
    for (String gender : groupGender.values()) {
      if (gender.equals("Male")) {
        men++;
      }
    }
    System.out.println("Men = " + men);
  }
}
