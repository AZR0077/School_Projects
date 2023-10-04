public class Candy
{
  private String name;
  private int calories;
  private int itemNum;

/**
 * Constructor for Candy object.
 * @param itemNumIn the number corresponding to the candy type. 1 is Snickers, 2 is M&Ms, 3 is MilkyWay, 4 is Twix and 5 is 3 Musketeers.
 * Candy type name and calories will be determined by the item number input.
 * */

  public Candy(int itemNumIn)
  {
    itemNum = itemNumIn;
    if (itemNum == 1)
    {
      name = "Snickers";
      calories = 45;
    }
    else if (itemNum == 2)
    {
      name = "M&Ms";
      calories = 65;
    }
    else if (itemNum == 3)
    {
      name = "MilkyWay";
      calories = 38;
    }
    else if (itemNum == 4)
    {
      name = "Twix";
      calories = 50;
    }
    else
    {
      name = "3 Musketeers";
      calories = 25;
    }
  }
  
  /**
   * Accessor Method for name
   */
  public String getName()
  {
    return name;
  }

  /**
   * Accessor Method for calories
   */
  public int getCalories()
  {
    return calories;
  }
  
  /**
   * Accessor Method for itemNum
   */
  public int getItemNum()
  {
    return itemNum;
  }
  
  /**
   * toString method for Candy Object
   * */
   
  public String toString()
  {
    return name + " (" + calories + ")";
  }
  
  /**
   * @Override
   * Equals method
   */
   
  public boolean equals(Object o)
  {
    Candy c = (Candy) o;
    return this.itemNum == c.itemNum;
  }
  
}