package homework_35.car_comparable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarTest {

  Car[] cars;

  @BeforeEach
  void setUp() {
    cars = new Car[5];
    cars[0] = new Car("Volkswagen", "red", 2000, 17200);
    cars[1] = new Car("Audi", "grey", 2018, 25400);
    cars[2] = new Car("Audi", "metall blue ", 2019, 27000);
    cars[3] = new Car("Mercedes", "black", 2023, 56000);
    cars[4] = new Car("BMW", "blue", 2004, 35700);
  }

  private void printArray(Object[] arr, String reportTitel) {
    for (Object o : arr) {
      System.out.println(o);
    }
  }

  @Test
  void testPrint() {
    printArray(cars, "List of cars");
  }

  @Test
  void testNativeSorting() {
    System.out.println("==========Before sorting of brands==========");
    printArray(cars, "List of cars");
    System.out.println("==========After sorting of brands==========");
    Arrays.sort(cars);
    printArray(cars, "List of cars sorted by price");
  }

  @Test
  void testComparator() {
    Comparator<Car> comparator = (c1, c2) -> Integer.compare(c1.getPrice(), c2.getPrice());
    printArray(cars, "List of cars");
    System.out.println("==========Before sorting of price, but sorting by brand==========");
    Arrays.sort(cars);
    printArray(cars, "List of cars sorted by price");
    System.out.println("==========After sorting of price==========");
    Arrays.sort(cars, comparator);
    printArray(cars, "List of cars sorted by price");
  }
}