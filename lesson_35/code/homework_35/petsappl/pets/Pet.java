package homework_35.petsappl.pets;

import java.util.Objects;

public abstract class Pet implements Comparable<Pet> {

  @Override
  public int compareTo(Pet o) {
    return Integer.compare(this.id , o.getId());//compare by id
  }

  private final int id;
  private String nickname;
  private String breed;
  private String color;

  public Pet(int id, String nickname, String breed, String color) {
    this.id = id;
    this.nickname = nickname;
    this.breed = breed;
    this.color = color;
  }

  public int getId() {
    return id;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Pet pet)) {
      return false;
    }
    return this.breed.equals(((Pet) o).breed) && this.nickname.equals(((Pet) o).nickname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breed, nickname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Pet ");
    sb.append("id=").append(id);
    sb.append(", nickname='").append(nickname);
    sb.append(", breed='").append(breed);
    sb.append(", color='").append(color);
    return sb.toString();
  }
}
