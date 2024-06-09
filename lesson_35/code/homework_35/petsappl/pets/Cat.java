package homework_35.petsappl.pets;

public class Cat extends Pet {

  private boolean isFriendly;

  public Cat(int id, String nickname, String breed, String color, boolean isFriendly) {
    super(id, nickname, breed, color);
    this.isFriendly = isFriendly;
  }

  public boolean isFriendly() {
    return isFriendly;
  }

  public void setFriendly(boolean friendly) {
    isFriendly = friendly;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Cat");
    sb.append(", id=").append(super.getId());
    sb.append(", nickname='").append(super.getNickname());
    sb.append(", breed='").append(super.getBreed());
    sb.append(", color='").append(super.getColor());
    sb.append(", isFriendly=").append(isFriendly);
    return sb.toString();
  }
}
