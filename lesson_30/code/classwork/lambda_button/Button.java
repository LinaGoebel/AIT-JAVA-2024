package classwork.lambda_button;

public class Button {

  private String title;
  private Action action;

  public Button(String name, Action action) {
    this.title = name;
    this.action = action;
  }

  @Override
  public String toString() {
    return "Button{" +
        "name='" + title + '\'' +
        ", action=" + action +
        '}';
  }

  public void click() {
    System.out.println("Enter button " + this.title);
    this.action.perform();
  }
}
