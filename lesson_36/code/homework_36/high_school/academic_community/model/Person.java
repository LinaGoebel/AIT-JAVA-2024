package homework_36.high_school.academic_community.model;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public abstract class Person implements Comparable<Person> {

  @Override
  public int compareTo(Person o) {
    return this.rolle.compareTo(o.rolle);
  }

  private final int id;
  private String firstName;
  private String lastName;
  private int age;
  private String gender;
  private String email;
  private String phoneNumber;
  private String rolle;
  private double salary;
  ;
  private LocalDate startDate;

  public Person(int id, String firstName, String lastName, int age, String gender, String email,
      String phoneNumber, String rolle, double salary, LocalDate startDate) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.rolle = rolle;
    this.salary = salary;
    this.startDate = startDate;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getRolle() {
    return rolle;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setRolle(String rolle) {
    this.rolle = rolle;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("id=").append(id);
    sb.append(", firstName='").append(firstName);
    sb.append(", lastName='").append(lastName);
    sb.append(", age=").append(age);
    sb.append(", gender='").append(gender);
    sb.append(", email='").append(email);
    sb.append(", phoneNumber='").append(phoneNumber);
    sb.append(", rolle='").append(rolle);
    sb.append(", salary=").append(salary);
    sb.append(", startDate=").append(startDate);
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Person person = (Person) o;
    return id == person.id && Objects.equals(firstName, person.firstName) &&
        Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastName);
  }

  public abstract double calcSalary();
}
