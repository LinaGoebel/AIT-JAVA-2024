package homework_32;

public interface Shop {

  boolean addComputer(Computer computer);

  Computer remove(long isbn);

  Computer findComputer(long isbn);

  int quantity();

  void print();

  void update(Computer computer);

  Computer[] findBlackFridayDeals(Computer[] computers);
}
