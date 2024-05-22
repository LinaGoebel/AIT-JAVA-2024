package classwork.button;

public class App {

  public static void main(String[] args) {
    Action action = new Action() {
      @Override
      public void perform() {
        System.out.println("World make better");
        System.out.println("World is better");
      }
    };
    Button button = new Button("Make world better", action);

    button.click();
  }

}
