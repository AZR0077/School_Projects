class Main {
  public static void main(String[] args) {
    System.out.println("Part A");
    int[] number = {7, 4, 5, 7, 6, 2, 3, 8, 9, 8, 2, 3, 4, 1, 1, 3};
    CreditCard x = new CreditCard("Mastercard", number);
    System.out.println(x.sumCheckValues());

    int[] number2 = {5, 4, 5, 7, 6, 2, 3, 8, 9, 8, 2, 3, 4, 1, 1, 3};
    CreditCard y = new CreditCard("Mastercard", number2);
    System.out.println(y.sumCheckValues());

    System.out.println("Part B");
    int[] number3 = {5, 4, 5, 7, 6, 2, 3, 8, 9, 8, 2, 3, 4, 1, 1, 3};
    CreditCard x3 = new CreditCard("Mastercard", number3);
    System.out.println(x3.isValid());


    int[] number4 = {5, 4, 5, 7, 6, 2, 3, 8, 9, 8, 2, 3, 4, 1, 1, 3};
    CreditCard x4 = new CreditCard("Visa", number4);
    System.out.println(x4.isValid());

    int[] number5 = {7, 4, 5, 7, 6, 2, 3, 8, 9, 8, 2, 3, 4, 1, 1, 3};
    CreditCard x5 = new CreditCard("Visa", number5);
    System.out.println(x5.isValid());

    int[] number6 = {6, 4, 4, 8, 6, 2, 3, 8, 9, 8, 2, 3, 4, 1, 1, 3};
    CreditCard x6 = new CreditCard("Discover", number6);
    System.out.println(x6.isValid());
  }
}