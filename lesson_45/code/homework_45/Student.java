package homework_45;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Student {

  private int id;
  private String firstName;
  private String lastName;
  private LocalDate birthDay;
  private String course;
  private int groupNum;
  private String country;
  private String gender;
  private int[] marks;

  public Student(int id, String firstName, String lastName, LocalDate birthDay, String course,
      int groupNum, String country, String gender, int[] marks) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDay = birthDay;
    this.course = course;
    this.groupNum = groupNum;
    this.country = country;
    this.gender = gender;
    this.marks = marks;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(LocalDate birthDay) {
    this.birthDay = birthDay;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public int getGroupNum() {
    return groupNum;
  }

  public void setGroupNum(int groupNum) {
    this.groupNum = groupNum;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int[] getMarks() {
    return marks;
  }

  public void setMarks(int[] marks) {
    this.marks = marks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Student student)) {
      return false;
    }
    return id == student.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Student: " +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", birthDay=" + birthDay +
        ", course='" + course + '\'' +
        ", groupNum=" + groupNum +
        ", country='" + country + '\'' +
        ", gender='" + gender + '\'' +
        ", marks= " + Arrays.toString(marks);
  }

}
