package homework_39.planets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetsAppl {

  public static void main(String[] args) {
    List<Planets> planetsList = new ArrayList<>();
    Planets planets = new Planets("Mercury", 57.91, 3.285e23, 0);
    planetsList.add(planets);
    planetsList.add(new Planets("Venus", 108.2, 4.867e24, 0));
    planetsList.add(new Planets("Mars", 227.9, 6.39e23, 2));
    planetsList.add(new Planets("Jupiter", 778.5, 1.898e27, 79));
    planetsList.add(new Planets("Uranus", 2871, 8.681e25, 27));
    planetsList.add(new Planets("Saturn", 1434, 5.683e26, 83));
    planetsList.add(new Planets("Neptune", 4495, 1.024e26, 14));
    planetsList.add(new Planets("Earth", 149.6, 5.972e24, 1));

    int size = planetsList.size();
    System.out.println("Number of planets: " + size);
    System.out.println("________unsorted list_____________");
    for (Planets p : planetsList) {
      System.out.println(p);
    }
    //sorting
    planetsList.sort(Planets::compareTo);
    System.out.println("________sorted list by name_____________");
    for (Planets p : planetsList) {
      System.out.println(p);
    }
    Comparator<Planets> planetsCoparator = new Comparator<>() {
      @Override
      public int compare(Planets o1, Planets o2) {
        return (int) (o1.getDistanceToSun() - o2.getDistanceToSun());
      }
    };
    planetsList.sort(planetsCoparator);
    System.out.println("________sorted list by distance to the Sun_____________");
    for (Planets p : planetsList) {
      System.out.println(p);
    }

    Comparator<Planets> planetsMassComparator = new Comparator<>() {
      @Override
      public int compare(Planets o1, Planets o2) {
        return (int) (o1.getMass() - o2.getMass());
      }
    };
    planetsList.sort(planetsMassComparator);
    System.out.println("________sorted list by mass_____________");
    for (Planets p : planetsList) {
      System.out.println(p);
    }

    Comparator<Planets> planetsNumberOfSatellitesComparator = new Comparator<>() {
      @Override
      public int compare(Planets o1, Planets o2) {
        return (int) (o1.getNumberOfSatellites() - o2.getNumberOfSatellites());
      }
    };
    planetsList.sort(planetsNumberOfSatellitesComparator);
    System.out.println("________sorted list by number of satellites_____________");
    for (Planets p : planetsList) {
      System.out.println(p);
    }
  }

}
