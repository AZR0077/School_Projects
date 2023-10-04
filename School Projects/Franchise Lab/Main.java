import java.util.Scanner;
import csteutils.myro.*;

public class Main {
  public static void main(String[] args) throws java.io.IOException {
    Food restauraunt = new Food(200, 150, 100, 50);
    restauraunt.displayPrices();
    restauraunt.displayInventory();
    restauraunt.placeOrder(195, 120, 95, 20);
  }
}