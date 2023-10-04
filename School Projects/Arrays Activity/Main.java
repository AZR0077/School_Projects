class Main {
  public static void main(String[] args) {

    // All this code just to print the array that was returned in the first method:
    int[] output = arrayPrac1();
    System.out.print("{");
    for (int i = 0; i < output.length; i++)
    {
      if (i < output.length - 1)
        System.out.print(output[i] + ", ");
      else 
        System.out.print(output[i]);
    }
    System.out.println("}");

    // Output for method 2:
    int [] scores = {40,50,34,97,28,65,98,12,77,68,92,91,90,36};
    arrayPrac2(scores);

    // Output for method 3:
    String[] x = {"Molly", "Steve", "Kyle", "Rebecca"};
    reverseArray(x);
  }

/* Declare and initialize an array called array1 whose index value ranges from 0 to 999 and whose element type is an integer.
Fill the array with values. All values in the array should hold even values from 0 to 2000. (Use a loop)
Return the array.
*/

public static int[] arrayPrac1()
{
  int[] array1 = new int[1001];
  for (int i = 0; i < array1.length; i++) {
    array1[i] = i * 2;
  }
  return array1;
}


/*  Find the lowest score.
    Find the highest score.
    Find the average.
    Find the average of the scores when the lowest score and the highest score are dropped. 
    Print the results.
    */

  public static void arrayPrac2(int [] scores)
  {
    int highest = scores[0];
    int lowest = scores[0];
    for(int i = 0; i < scores.length; i++) {
      if (scores[i] < lowest) {
        lowest = scores[i];
      }
      else if (scores[i] > highest) {
        highest = scores[i];
      }
    }
    int average = 0;
    for (int i = 0; i < scores.length; i++) {
      average += scores[i];
    }
    int average2 = (average - (highest + lowest)) / (scores.length - 2);
    average = average / scores.length;
    
    System.out.println("The lowest score is: " + lowest);

    System.out.println("The highest score is: " + highest);

    System.out.println("The average is: " + average);

    System.out.println("The average with the high and low thrown out is: " + average2);

  }

  //Reverse the order of the names within the array and print both arrays.
  public static void reverseArray(String[] names)
  {
    String names1 = "";
    String names2 = "";
    String[] array1 = new String[names.length];
    for (int i = 0; i < names.length; i++) {
      array1[names.length - i - 1] = names[i];
    }
    for (int j = 0; j < names.length; j++) {
      names1 += names[j] + ", ";
      names2 += array1[j] + ", ";
    }
    System.out.println("The array before reversing: " + names1.substring(0, names1.length() - 2));

    System.out.println("The array after reversing: " + names2.substring(0, names2.length() - 2)); 
  }
}