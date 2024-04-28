package homework.controller;

import classwork.library.model.Book;
import homework.model.Computer;
import java.math.BigInteger;

public class Stock {

  private Computer[] computers;
  private int size;

  public void setSize(int size) {
    this.size = size;
  }

  public Stock(int capacity) {
    this.computers = new Computer[capacity];
    this.size = 0;
  }

  public boolean addComputer(Computer computer) {
    if (computer == null || size == computers.length || findComputer(computer.getMsn()) != null) {
      return false;
    }
    computers[size] = computer;
    size++;
    return true;
  }

  private Computer findComputer(BigInteger msn) {
    for (int i = 0; i < size; i++) {
      if (computers[i].getMsn().equals(msn)) {
        return computers[i];
      }
    }
    return null;
  }

  public Computer removeComputer(BigInteger msn) {
    Computer victim = null;
    for (int i = 0; i < size; i++) {
      if (computers[i].getMsn().equals(msn)) {
        victim = computers[i];
        computers[i] = computers[size - 1];
        computers[size - 1] = null;
        size--;
        break;
      }
    }
    return victim;
  }

  public int getSize() {
    return size;
  }

  public void printComputer(){
    for (int i = 0; i < size; i++) {
      System.out.println(computers[i]);
    }
    System.out.println("______________________________________________ ");
  }
}
