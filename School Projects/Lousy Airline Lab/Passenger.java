public class Passenger {
  //instance variables
  private String firstName;
  private String lastName;
  private int flyerNum;
  private static int countFlyerNum = 0;
  private int cash;

//overloaded constructor
  public Passenger(String firstName, String lastName, int cash) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.cash = cash;
    flyerNum = countFlyerNum + 1;
    countFlyerNum++;
  }
  
  //default constructor
  public Passenger() {
    firstName = "unknown";
    lastName = "unknown";
    cash = (int)(Math.random() * 1000);
    flyerNum = countFlyerNum + 1;
    countFlyerNum++;
  }

  //accessor methods
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getFlyerNum() {
    return flyerNum;
  }

  public int getCash() {
    return cash;
  }

  //mutator methods
  public void setFirstName(String name) {
    firstName = name;
  }
  
  public void setLastName(String name) {
    lastName = name;
  }

  public void setFlyerNum(int num) {
    flyerNum = num;
  }

  public void setCash(int num) {
    cash = num;
  }

  //toString() method
  public String toString() {
    return "Last name: " + lastName + " First name: " + firstName + " Cash: $" + cash + " Frequent Flyer Number: " + flyerNum + "\n";
  }
  
}