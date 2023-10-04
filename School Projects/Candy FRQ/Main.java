class Main {
  public static void main(String[] args) {
    System.out.println("Contents in bag:");
    AssortedCandyBag b1 = new AssortedCandyBag(20);
    b1.displayBag();
    System.out.println("Total Calories");
    System.out.println(b1.getTotalCalories());
    System.out.println("Most # of same candies in a row:");
    System.out.println(b1.findLargestNumInRow());
    System.out.println("Contents in bag:");
    AssortedCandyBag b2 = new AssortedCandyBag(10);
    b2.displayBag();
    System.out.println("Total Calories");
    System.out.println(b2.getTotalCalories());
    System.out.println("Most # of same candies in a row:");
    System.out.println(b2.findLargestNumInRow());
  }
}