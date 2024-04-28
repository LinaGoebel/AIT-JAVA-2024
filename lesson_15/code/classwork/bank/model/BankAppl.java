package classwork.bank.model;

public class BankAppl {

  public static void main(String[] args) {
    BankAccount acc0 = new BankAccount(1000, "Peter", "Bank#1", 101, 100);

    System.out.println(acc0.getBalance());
    System.out.println(acc0.getOwner());
    acc0.display();
    acc0.deposit(500);
    System.out.println(acc0.getBalance());
    acc0.display();

    BankAccount acc1 = new BankAccount(2000, "Jon", "Bank#1", 101);
    acc1.display();

    BankAccount acc2 = new BankAccount(3000, "Bank#1", 101);
    acc2.deposit(1000000);
    acc2.display();

    acc2.display("Mr.");
    acc2.setOwner("Pinguin");
    acc2.display("Mr. ");
  }

}
