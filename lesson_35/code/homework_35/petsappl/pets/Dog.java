package homework_35.petsappl.pets;

public class Dog extends Pet {

  private String favoriteActivity;

  public Dog(int id, String nickname, String breed, String color, String favoriteActivity) {
    super(id, nickname, breed, color);
    this.favoriteActivity = favoriteActivity;
  }

  public String getFavoriteActivity() {
    return favoriteActivity;
  }

  public void setFavoriteActivity(String favoriteActivity) {
    this.favoriteActivity = favoriteActivity;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Dog");
    sb.append(", id=").append(super.getId());
    sb.append(", nickname='").append(super.getNickname());
    sb.append(", breed='").append(super.getBreed());
    sb.append(", color='").append(super.getColor());
    sb.append(", favoriteActivity='").append(favoriteActivity);
    return sb.toString();
  }
}
