package classwork_32.company.model;

import java.util.Objects;

public abstract class Employee {

  //fields of class
  protected final int id;
  protected String firstName;
  protected String secondName;
  protected int age;
  protected double hours;

  //constructor

  public Employee(int id, String firstName, String secondName, int age, double hours) {
    this.id = id;
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
    this.hours = hours;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
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
    StringBuilder sb = new StringBuilder("Employee ");
    sb.append("id = ").append(id);
    sb.append(", firs name: ").append(firstName);
    sb.append(", second name: ").append(secondName);
    sb.append(", age: ").append(age);
    sb.append(", hours: ").append(hours);
    sb.append(", salary: ").append(calcSalary());
    return sb.toString();
  }

  public abstract double calcSalary();//abstract method
}
