package homework_32.computerappl.dao;

import java.util.Arrays;

public class ShopImpl implements Shop {

  private Computer[] computers;
  int size;

  public ShopImpl(int capacity) {
    computers = new Computer[capacity];
  }

  @Override
  public boolean addComputer(Computer computer) {

    if (computer == null || size >= computers.length || findComputer(computer.getIsbn()) != null) {
      return false;
    }
    computers[size++] = computer;
    return true;
  }

  @Override
  public Computer remove(long isbn) {
    for (int i = 0; i < size; i++) {
      if (computers[i].getIsbn() == isbn) {
        Computer removed = computers[i];
        computers[i] = computers[--size];
        computers[size] = null;
        return removed;
      }
    }
    return null;
  }

  @Override
  public Computer findComputer(long isbn) {
    for (int i = 0; i < size; i++) {
      if (computers[i].getIsbn() == isbn) {
        return computers[i];
      }
    }
    return null;
  }

  @Override
  public int quantity() {
    return size;
  }

  @Override
  public void print() {
    for (int i = 0; i < size; i++) {
      System.out.println(computers[i]);
    }
  }

  @Override
  public void update(Computer computer) {
    for (int i = 0; i < size; i++) {
      if (computers[i].getIsbn() == computer.getIsbn()) {
        computers[i] = computer;
        return;
      }
    }
  }

  @Override
  public Computer[] findBlackFridayDeals(Computer[] computers) {
    Computer[] result = Arrays.copyOf(computers, computers.length);
    int resultSize = 0;
    for (Computer computer : computers) {
      if (computer.getDiscount() > 0) {
        result[resultSize++] = computer;
      }
    }
    return Arrays.copyOf(result, resultSize);
  }
}

