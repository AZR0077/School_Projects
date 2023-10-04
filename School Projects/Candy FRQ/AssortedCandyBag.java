public class AssortedCandyBag
{
  private Candy[] bag;
  
  /**
   * Constructor for AssortedCandyBag class.
   * @param numIn is the number of candies that will be in the bag.
   * Adds num Candy objects to the bag array.
   * */
  public AssortedCandyBag(int numPieces)
  {
    bag = new Candy[numPieces];
    for (int i = 0; i < numPieces; i++) {
      Candy candy = new Candy((int)(Math.random() * 5) + 1);
      bag[i] = candy;
    }
  }
  
  /**
   * @return calculates the total number of calories in the bag.
   * */
  public int getTotalCalories()
  {
    int calories = 0;
    for (int i = 0; i < bag.length; i++) {
      calories += bag[i].getCalories();
    }
    return calories;
  }
  
  /**
   * Finds the largest number of CONSECUTIVE candies that are the same. So if the array has 5 Twix candies in a row as the best result, the method returns 5.
   * @return number of consecutive matching candies.
   * */
  public int findLargestNumInRow()
  {
    int count = 0;
    int currentCount = 0;
    for (int i = 1; i < bag.length - 1; i++) {
      if (bag[i].getItemNum() == bag[i - 1].getItemNum()) {
        currentCount += 1;
      }
      if (currentCount > 0 && bag[i].getItemNum() != bag[i - 1].getItemNum()) {
        if (currentCount + 1 > count) {
          count = currentCount + 1;
        }
        currentCount = 0;
      }
    }
    return count;
  }
  
  /**
   * Prints the contents in the bag
   * */
  public void displayBag()
  {
    for (int i = 0; i < bag.length - 1; i++)
    {
      System.out.print(bag[i] + ", ");
    }
    System.out.println(bag[bag.length - 1]);
  }
  
  public Candy[] getBag()
  {
    return bag;
  }
}

