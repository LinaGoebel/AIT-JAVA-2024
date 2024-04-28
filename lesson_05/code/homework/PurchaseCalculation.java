package homework;

// Сделайте расчет покупки товаров со скидками. Товар А стоит X евро и на него скидка D%, а товар B
// стоит Y евро и на него скидка С%. Клиент взял N товаров A и M товаров B. Если сумма покупки
// превысила 100 евро, то полагается дополнительная скидка 5%. Вычислите итоговую стоимость покупки
// и величину полученной скидки.
public class PurchaseCalculation {

  public static void main(String[] args) {
    double productA = 25;
    double discountD = 15;
    int amountN = 12;
    double productB = 38;
    double discountC = 10;
    int amountB = 34;

    double discountA = productA * amountN * discountD / 100;
    double discountB = productB * amountB * discountC / 100;

    double sumA = (productA * amountN) - discountA;
    double sumB = (productB * amountB) - discountB;
    double sum = sumA + sumB;

    if (sum > 100) {
      double extraDiscount;
      extraDiscount = sum * 5 / 100;
      System.out.printf("Purchase price %.2f euros %n", sum - extraDiscount);
      System.out.printf("Discount received %.2f euros ", extraDiscount + discountA + discountB);
    } else {
      System.out.printf("Purchase price %.2f euros %n", sum);
      System.out.printf("Discount received %.2f euros ", discountA + discountB);
    }
  }
}