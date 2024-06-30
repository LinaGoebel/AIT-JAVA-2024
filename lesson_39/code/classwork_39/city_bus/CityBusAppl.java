package classwork_39.city_bus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class  CityBusAppl {

  public static void main(String[] args) {
    List<Bus> cityBusList = new ArrayList<>();
    Bus bus = new Bus("MAN", "num1", "100", 60);
    cityBusList.add(bus);
    cityBusList.add(new Bus("Mercedes", "num2", "101", 70));
    cityBusList.add(new Bus("Scanie", "num3", "102", 50));
    cityBusList.add(new Bus("Volvo", "num4", "103", 90));
    cityBusList.add(new Bus("Mercedes", "num5", "104", 40));

    int size = cityBusList.size();
    System.out.println("Number of buses: " + size);
    System.out.println("-------------------------unsorted list-------------------------");
    for (Bus b : cityBusList) {
      System.out.println(b);
    }
    //sorting
    cityBusList.sort(Bus::compareTo);
    System.out.println("-------------------------sorted list-------------------------");
    for (Bus b : cityBusList) {
      System.out.println(b);
    }
    int totalCapacity = 0;
    for(Bus b : cityBusList){
      totalCapacity += b.getCapacity();
    }
    System.out.println("Total capacity: " + totalCapacity);

    Comparator<Bus> busModelComparator = new Comparator<>() {
      @Override
      public int compare(Bus o1, Bus o2) {
        return o1.getModel().compareTo(o2.getModel());
      }
    };
    System.out.println("-------------------------sorted list by model-------------------------");
    cityBusList.sort(busModelComparator);
    for (Bus b : cityBusList) {
      System.out.println(b);
    }
  }

}
