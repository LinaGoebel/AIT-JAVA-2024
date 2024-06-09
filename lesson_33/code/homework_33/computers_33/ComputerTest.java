package homework_33.computers_33;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComputerTest {

  Computer[] comp;

  @BeforeEach
  void setUp() {
    comp = new Computer[5];
    comp[0] = new Computer(1234567890123L, "Dell", "XPS 13", 999.99, 20,
        8);
    comp[1] = new Computer(1122334455667L, "HP", "Envy", 899.99, 0,
        16);
    comp[2] = new Computer(1984567890226L, "Asos", "i7", 512, 0,
        16);
    comp[3] = new Computer(6655443322110L, "Samsung", "Galaxy S21", 699.99,
        20.0, 4);

    comp[4] = new Computer(6954561190100L, "Apple", "iPhone 13", 729.00, 10.0,
        28);
  }

  @Test
  void testComputerSort() {
    System.out.println(
        "=======================Test Computer before brand sort=======================");
    printArray(comp);
    Arrays.sort(comp);
    System.out.println(
        "=======================Test Computer after brand sort=======================");
    printArray(comp);
  }

  @Test
  void testComputerComparator() {
    Comparator<Computer> computerComparator = new Comparator<Computer>() {
      @Override
      public int compare(Computer o1, Computer o2) {
        return (int) (o1.getOperationSystem() - o2.getOperationSystem());
      }
    };
    System.out.println(
        "=======================Test Computer before operation system sort=======================");
    printArray(comp);
    Arrays.sort(comp, computerComparator);
    System.out.println(
        "=======================Test Computer after operation system sort=======================");
    printArray(comp);
  }

  private void printArray(Object[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}