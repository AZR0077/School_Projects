public class CreditCard {
  private String cardType;
  private int[] cardNum;
 
  public CreditCard(String cardType, int[] cardNum)
  	{ 
      this.cardType = cardType;
      this.cardNum = cardNum;
     }

  public int sumCheckValues()
  {
    int sum = 0;
    boolean s1 = true; // 1
    for (int i = cardNum.length - 1; i >= 0; i--) {
      if (s1) {
        if (cardNum[i] > 9) {
        
        }
        else {
          sum += cardNum[i];
        }
      }
      else {
        if (cardNum[i] * 2 > 9) {
          sum += 1 + (cardNum[i] * 2 % 10);
        }
        else {
          sum += cardNum[i] * 2;
        }
      }
      if (s1) {
        s1 = false;
      }
      else {
        s1 = true;
      }
    }
    return sum;
  }
  
  /** Returns true if the card is valid described in part B
  Visa cards – Begin with a 4 and have 13 or 16 digits
  Mastercard cards – Begin with a 5 and has 16 digits
  American Express cards – Begin with a 3, followed by a 4 or a 7  has 15 digits
  Discover cards – Begin with a 6 and have 16 digits
  */
  public boolean isValid()
  { 
    if (sumCheckValues() % 10 != 0) {
      return false;
    }
    if (cardType.equals("Mastercard")) {
      if (cardNum[0] == 5 && cardNum.length == 16) {
        return true;
      }
    }
    if (cardType.equals("Visa")) {
      if (cardNum[0] == 4 && (cardNum.length == 13 || cardNum.length == 16)) {
        return true;
      }
    }
    if (cardType.equals("American Express")) {
      if (cardNum[0] == 3 && (cardNum[1] == 4 || cardNum[1] == 7) && cardNum.length == 15) {
        return true;
      }
    }
    if (cardType.equals("Discover")) {
      if (cardNum[0] == 6 && cardNum.length == 16) {
        return true;
      }
    }
    return false;
  }
}
