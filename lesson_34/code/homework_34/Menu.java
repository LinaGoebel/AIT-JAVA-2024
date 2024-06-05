package homework_34;

public enum Menu {
  ADD_TASK(1, "Add a task"),
  SEE_ALL_TASKS(2, "see all tasks"),
  DELETE_ENTRY(3, "delete entry (by number)"),
  EDIT_TASK(4, "edit task (by number)"),
  GO_OUT(5, "go out");

  private int number;
  private String action;


  Menu(int number, String action) {
    this.number = number;
    this.action = action;
  }

  public int getNumber() {
    return number;
  }

  public String getAction() {
    return action;
  }

  public static void printMenu() {

    Menu[] menu = Menu.values();
    for (int i = 0; i < menu.length; i++) {
      System.out.println(menu[i].getNumber() + " - " + menu[i].getAction());
    }
  }
}
