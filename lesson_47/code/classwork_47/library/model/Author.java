package classwork_47.library.model;

import java.time.LocalDate;
import java.util.Objects;

public class Author {

  final String name;
  final String lastName;
  final LocalDate birthDay;
  String country;
  double rating;

  public Author(String name, String lastName, LocalDate birthDay, String country, double rating) {
    this.name = name;
    this.lastName = lastName;
    this.birthDay = birthDay;
    this.country = country;
    this.rating = rating;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public LocalDate getBirthDay() {
    return birthDay;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Author author)) {
      return false;
    }
    return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastName);
  }

  @Override
  public String toString() {
    return "Author{" +
        "name='" + name + '\'' +
        ", lastName='" + lastName + '\'' +
        ", birthDay=" + birthDay +
        ", country='" + country + '\'' +
        ", rating=" + rating +
        '}';
  }

  public String displayAuthor() {
    return "name= " + name + ", lastName='" + lastName + ", birthDay=" + birthDay;
  }
}

