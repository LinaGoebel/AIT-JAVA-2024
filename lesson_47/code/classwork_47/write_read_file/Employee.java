package classwork_47.write_read_file;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

  private final int id;
  private String name;
  private String lastName;
  private int age;
  private double salary;
  private Address address;

  public Employee(int id, String name, String lastName, int age, double salary, Address address) {
    this.id = id;
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    this.salary = salary;
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Employee employee)) {
      return false;
    }
    return id == employee.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", salary=" + salary +
        ", address=" + address +
        '}';
  }
}
