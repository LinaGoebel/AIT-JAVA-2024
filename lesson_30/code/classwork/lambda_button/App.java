package classwork.lambda_button;

public class App {

  public static void main(String[] args) {
    Action action = () -> {

      System.out.println("World make better");
      System.out.println("World is better");
    };

    Button button = new Button("Make world better", action);

    button.click();
  }
}
