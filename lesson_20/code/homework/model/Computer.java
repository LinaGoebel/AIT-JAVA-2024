package homework.model;

import java.math.BigInteger;
import java.util.Objects;

public class Computer {

  public static final long BARCODE_LENGTH = 20;

  private String brand;
  private String cpu;
  private int ram;
  private BigInteger msn;

  public Computer(String brand, String cpu, int ram, BigInteger msn) {
    this.brand = brand;
    this.cpu = cpu;
    this.ram = ram;
    this.msn = checkMsn(msn);
  }

  private BigInteger checkMsn(BigInteger msn) {
    if (countDigit(msn) == BARCODE_LENGTH) {
      return msn;
    }
    return BigInteger.valueOf(-1);
  }

  private int countDigit(BigInteger msn) {
    int count = 0;
    do {
      count++;
      msn = msn.divide(BigInteger.TEN);
    } while (msn.compareTo(BigInteger.ZERO) > 0);
    return count;
  }


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
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

  public BigInteger getMsn() {
    return msn;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "brand='" + brand + '\'' +
        ", cpu='" + cpu + '\'' +
        ", ram=" + ram +
        ", msn=" + msn +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Computer computer)) {
      return false;
    }
    return ram == computer.ram && Objects.equals(brand, computer.brand)
        && Objects.equals(cpu, computer.cpu) && Objects.equals(msn, computer.msn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, cpu, ram, msn);
  }
}


