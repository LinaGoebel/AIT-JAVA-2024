package classwork.string_ex;

import java.util.Objects;

public class Computer {

  private static final int ISBN_LENGTH = 20;

  public long getIsbn() {
    return isbn;
  }

  public void setIsbn(long isbn) {
    this.isbn = isbn;
  }

  private String cpu;
  private int ram;
  private int ssd;
  private String brand;
  private long isbn;

  public Computer(String cpu, int ram, int ssd, String brand, long isbn) {
    this.cpu = cpu;
    this.ram = ram;
    this.ssd = ssd;
    this.brand = brand;
    this.isbn = checkIsbn(isbn);
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public int getSsd() {
    return ssd;
  }

  public void setSsd(int ssd) {
    this.ssd = ssd;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Computer computer)) {
      return false;
    }
    return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu)
        && Objects.equals(brand, computer.brand);
  }

  @Override
  public String toString() {
    return "Computer{" +
        "cpu='" + cpu + '\'' +
        ", ram=" + ram +
        ", ssd=" + ssd +
        ", brand='" + brand + '\'' +
        ", isbn=" + isbn +
        '}';
  }

  private long checkIsbn(long isbn){
    if(countDigits(isbn) == ISBN_LENGTH){
      return isbn;
    }
    return -1;
  }
  private int countDigits(long isbn) {
    int count = 0;
    do {
      count++;
      isbn = isbn / 10;
    }while (isbn !=0);

    return  count;
  }
}
