package homework;

import homework.controller.Stock;
import homework.model.Computer;
import java.math.BigInteger;

public class ComputerShop {

  public static void main(String[] args) {
    Stock stock = new Stock(29);

    stock.addComputer(new Computer("HP", "AMD Ryzen", 8, new BigInteger("15678952146895789654")));
    stock.addComputer(
        new Computer("Hyrican", "Ryzen5", 32, new BigInteger("78998952146895789654")));
    stock.addComputer(new Computer("Samsung", "i3", 8, new BigInteger("23678952146895789655")));
    System.out.println(stock.getSize());
    stock.printComputer();

    stock.addComputer(new Computer("Apple", "M1Chip", 8, new BigInteger("86678952146895789111")));
    System.out.println(stock.getSize());
    stock.printComputer();

    stock.removeComputer(new BigInteger("15678952146895789654"));
    stock.removeComputer(new BigInteger("78998952146895789654"));
    System.out.println(stock.getSize());
    stock.printComputer();
  }
}
