package homework_product;

public interface Supermarket {

  boolean addProduct(Product product);


  Product remove(long isbn);

  Product findProduct(long isbn);

  int quantity();

  void print();

  void update(Product product);

  void expDate();

}
