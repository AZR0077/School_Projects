import java.util.Scanner;
import csteutils.myro.*;

public class Food {
  //instance variables
  private String pizza;
  private int numPizza;
  private double pizzaPrice;

  private String burger;
  private int numBurger;
  private double burgerPrice;

  private String fries;
  private int numFries;
  private double friesPrice;

  private String soda;
  private int numSoda;
  private double sodaPrice;
  
  private double revenue;
  double percent;
  double buyingCostPizza;
  double buyingCostBurger;           
  double buyingCostFries;
  double buyingCostSoda;
  private double expenditure;

  //constructor
  public Food(int invPizza, int invBurger, int invFries, int invSoda) throws java.io.IOException {
    pizzaPrice = 6.99;
    burgerPrice = 5.99;
    friesPrice = 1.49;
    sodaPrice = 2.99;
    expenditure = 0.00;
    
    percent = 0.6;
    buyingCostPizza = percent * pizzaPrice;
    buyingCostBurger = percent * burgerPrice;                  buyingCostFries = percent * friesPrice;
    buyingCostSoda = percent * sodaPrice;
    
    pizza = "pizza";
    numPizza = invPizza;
    expenditure += buyingCostPizza * numPizza;

    burger = "burger";
    numBurger = invBurger;
    expenditure += buyingCostBurger * numBurger;

    fries = "fries";
    numFries = invFries;
    expenditure += buyingCostFries * numFries;

    soda = "soda";
    numSoda = invSoda;
    expenditure += buyingCostSoda * numSoda;

    revenue = 0.00;

    MyroColorImage pic = new MyroColorImage("logo.png");
    pic.show();
  }

  //methods
  public void displayPrices() {
    System.out.println("\n" +  pizza + " price: " + pizzaPrice);
    System.out.println("\n" + burger + " price: " + burgerPrice);
    System.out.println("\n" + fries + " price: " + friesPrice);
    System.out.println("\n" + soda + " price: " + sodaPrice + "\n");
  } 

  public void displayInventory() {
    System.out.println("STOCK INVENTORY");
    System.out.println("\n" + pizza + " quantity: " + numPizza);
    System.out.println("\n" + burger + " quantity: " + numBurger);
    System.out.println("\n" + fries + " quantity: " + numFries);
    System.out.println("\n" + soda + " quantity: " + numSoda + "\n");
  }

  public void placeOrder(int orderedPizza, int orderedBurger, int orderedFries, int orderedSoda) {
    double total = (orderedPizza * pizzaPrice) + (orderedBurger * burgerPrice) + (orderedFries + friesPrice) + (orderedSoda + sodaPrice);
    Scanner input = new Scanner(System.in);
    System.out.println("Thank you for your order!");
    if ((orderedPizza > numPizza) || (orderedBurger > numBurger) || (orderedFries > numFries) || (orderedSoda > numSoda)) {
      System.out.println("We do not have enough stock!");
      displayInventory();
      return;
    }
    else {
      System.out.println("Your total is " + Math.round(total * 100.0)/100.0);
      System.out.print("Do you have a coupon code? ");
      String answer = input.next();
      if (answer.equals("senior")) {
        total *= 0.9;
        System.out.println("Your coupon was accepted.");
      }
      else if (answer.equals("teacher")) {
        total *= 0.85;
        System.out.println("Your coupon was accepted.");
      }
      else {
        System.out.println("No coupon was applied.");
      }
      System.out.println("Your new total is " + Math.round(total * 100.0)/100.0);
    }
    System.out.print("How much will you pay with? ");
    double payment = input.nextDouble();
    if (payment < total) {
      System.out.println("You do not have enough money!");
      return;
    }
    System.out.println("Your change is " + Math.round((payment-total) * 100.0)/100.0 + "\n");
    revenue += total;
    numPizza -= orderedPizza;
    numBurger -= orderedBurger;
    numFries -= orderedFries;
    numSoda -= orderedSoda;
    displayInventory();
    System.out.println("Restocking...\n");
    orderInventory();
  }

  public void orderInventory() {
    double payment = 0.00;
    
    if (numPizza < 10) {
      numPizza += 10;
      payment += buyingCostPizza * 10;
    }
    if (numBurger < 10) {
      numBurger += 10;
      payment += buyingCostBurger * 10;
    }
    if (numFries < 10) {
      numFries += 10;
      payment += buyingCostFries * 10;
    }
    if (numSoda < 10) {
      numSoda += 10;
      payment += buyingCostSoda * 10;
    }
    System.out.println("Payment for stocking up inventory: " + Math.round(payment*100.0)/100.0 + "\n");
    
    expenditure += payment;

    if (expenditure > revenue) {
      System.out.println("The expenses are more than the revenue! Reconsider the pricing.");
    }

    System.out.println("Revenue: " + Math.round(revenue*100.0)/100.0);
    System.out.println("Expenditure: " + Math.round(expenditure*100.0)/100.0 + "\n");
    
    displayInventory();
  }
}