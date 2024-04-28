package classwork.string_ex;

import classwork.string_ex.Computer;
import java.util.Scanner;

public class ComputerAppl {

  public static void main(String[] args) {
    Computer computer1 = new Computer("i5", 16, 512, "HP", 1566L);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter cpu: ");
    String cpu = scanner.nextLine();

    System.out.println("Enter RAM: ");
    int ram = scanner.nextInt();

    System.out.println("Enter SSD: ");
    int ssd = scanner.nextInt();

    scanner.nextLine();

    System.out.println("Enter brand: ");
    String brand = scanner.nextLine();

    Computer computer2 = new Computer(cpu, ram, ssd, brand, 154L);

    System.out.println("Comp 1: " + computer1);
    System.out.println("Comp 2: " + computer2);

    System.out.println("Comp1 = Comp2: " + computer1.equals(computer2)); // true or false

  }
}
