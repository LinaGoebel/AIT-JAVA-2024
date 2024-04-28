package classwork.computers;

import classwork.computers.model.Computer1;
import classwork.computers.model.Laptop1;
import classwork.computers.model.SmartPhone1;

public class ComputerCompareAppl {

  public static void main(String[] args) {
    Computer1[] comp = new Computer1[3];
    comp[0] = new Computer1("i5", 12, 512, "HP", 1000);
    comp[1] = new Laptop1("i7", 16, 512, "Samsung", 800, 15, 2.2, 8);
    comp[2] = new SmartPhone1("Snapdragon", 64, 2042, "Samsung", 1200,
        11, 0.3, 10, "Android 14", true);

    printArray(comp);

    Computer1 computer = new Computer1("i5", 12, 512, "HP", 1000);
    System.out.println(computer);
    System.out.println(comp[0]);
    boolean check = computer == comp[0];
    System.out.println(check);
    System.out.println("_____________________________");
    System.out.println(computer.equals(comp[0]));
  }

  public static void printArray(Object[] comp) {
    for (int i = 0; i < comp.length; i++) {
      System.out.println(comp[i].toString());
    }
  }
}
