package homework_32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShopImplTest {

  Shop shop;
  Computer[] comp;

  @BeforeEach
  void setUp() {
    shop = new ShopImpl(6);
    comp = new Computer[5];
    comp[0] = new Laptop(1234567890123L, "Dell", "XPS 13", 999.99, 20,
        15, 2.2, 8);
    comp[1] = new Laptop(1122334455667L, "HP", "Envy", 899.99, 0,
        14.5, 2.3, 7);
    comp[2] = new Laptop(1984567890226L, "Asos", "i7", 512, 0,
        16, 3.0, 9);
    comp[3] = new Smartphone(6655443322110L, "Samsung", "Galaxy S21", 699.99,
        20.0, "Android", true);

    comp[4] = new Smartphone(6954561190100L, "Apple", "iPhone 13", 729.00, 10.0,
        "iOS 15", true);

    for (int i = 0; i < comp.length; i++) {
      shop.addComputer(comp[i]);

    }
  }

  @Test
  void addComputer() {
    assertFalse(shop.addComputer(null));
    assertFalse(shop.addComputer(comp[1]));
    Computer comp = new Laptop(1233367890123L, "Apple", "MacBook Pro 16", 1866.20,
        0, 16, 2, 22);
    assertTrue(shop.addComputer(comp));
    assertEquals(6, shop.quantity());
    Computer computerOneMore = new Smartphone(6994561190334L, "Huawei", "2021 LTE", 119.21,
        20, "Android", false);
    assertFalse(shop.addComputer(computerOneMore));

    shop.print();

  }

  @Test
  void remove() {
    assertEquals(comp[0], shop.remove(1234567890123L));
    assertEquals(comp[1], shop.remove(1122334455667L));
    System.out.println("remove: " + comp[0] + " and remove: \n" + comp[1]);
    assertEquals(3, shop.quantity());
    assertNull(shop.remove(1000000000000L));
    shop.print();
  }

  @Test
  void findComputer() {
    assertEquals(comp[3], shop.findComputer(6655443322110L));
    assertNull(shop.findComputer(1234568971254L));
  }

  @Test
  void quantity() {
    assertEquals(5, shop.quantity());
    shop.print();
  }

  @Test
  void print() {
    shop.print();
  }

  @Test
  void update() {
    Computer computer = shop.findComputer(6655443322110L);
    System.out.println("before update: " + shop.findComputer(6655443322110L));
    computer.setPrice(650.00);
    shop.update(computer);
    System.out.println("update: " + shop.findComputer(6655443322110L));
    Computer updateComputer = shop.findComputer(6655443322110L);
    assertEquals(650.00, updateComputer.getPrice());
  }

  @Test
  void findBlackFridayDeals() {
    Computer[] deals = shop.findBlackFridayDeals(comp);
    assertNotNull(deals);
    assertEquals(3, deals.length);
    assertEquals(comp[0], deals[0]);
    assertEquals(comp[3], deals[1]);
    assertEquals(comp[4], deals[2]);

    System.out.println("Black Friday deals: " + "\t");
    for (int i = 0; i < deals.length; i++) {
      System.out.println(deals[i]);
    }
  }
}