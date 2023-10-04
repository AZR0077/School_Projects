class Main {
  public static void main(String[] args) {
    int[][] table = {{5, 2, 3, 2}, 
                     {1, 3, 4, 5},
                     {5, 4, 5, 5},
                     {1, 2, 3, 2}};
    num1(table);
    num2(table);
    num3(table);
    num4(table);
    num5(table);
    num6(table, 0, 1);
    num7(table, 1, 2);
    num8(table, 0, 1);
    num9(table, 0, 1);
    // print methods 6 - 9 using a nested loop (add new line in your outer for loop):
    
  }

  public static void num1(int[][] arr)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        count += arr[i][j];
      }
    }
    System.out.println(count);
  }
  public static void num2(int[][] arr)
  {
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr[i].length; j++) {
        count += arr[i][j];
      }
      System.out.println("Average for Row " + i + ": " + count / 4.0);
    }
    System.out.println();
  }
  public static void num3(int[][] arr)
  {
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr[i].length; j++) {
        count += arr[j][i];
      }
      System.out.println("Average for Row " + i + ": " + count / 4.0);
    }
    System.out.println();
  }
  public static void num4(int[][] arr)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count += arr[i][i];
    }
    System.out.println(count);
  }
  public static void num5(int[][] arr)
  {
    int count = 0;
    int temp = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      count += arr[i][temp];
      temp++;
    }
    System.out.println(count);
  }
  public static int[][] num6(int[][] arr, int row, int column)
  {
    for (int i = 0; i < arr[row].length; i++) {
      arr[row][i] = 0;
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (j == column) {
          arr[i][j] = 0;
        }
      }
    }
    print(arr);
    return arr;
  }

  public static int[][] num7(int[][] arr, int row, int column)
  {
    arr[row][column] = 0;
    arr[row - 1][column] = 0;
    arr[row][column - 1] = 0;
    arr[row][column + 1] = 0;
    print(arr);
    return arr;
  }
  public static int[][] num8(int[][] arr, int rowNum1, int rowNum2)
  {
    int[] temp;
    temp = arr[rowNum2];
    arr[rowNum2] = arr[rowNum1];
    arr[rowNum1] = temp;
    print(arr);
    return arr;
  }
  public static int[][] num9(int[][] arr, int cNum1, int cNum2)
  {
    int[][] temp = new int[arr.length][arr[0].length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        temp[j][i] = arr[i][j];
      }
    }
    int[] temp1;
    temp1 = temp[cNum2];
    temp[cNum2] = temp[cNum1];
    temp[cNum1] = temp1;
    for (int i = 0; i < temp.length; i++) {
      for (int j = 0; j < temp[i].length; j++) {
        arr[j][i] = temp[i][j];
      }
    }
    print(arr);
    return arr;
  }
  
  public static void print(int[][] nums) {
    System.out.println("{");
    for (int r = 0; r < nums.length; r++) {
      System.out.print("[");
      for (int c = 0; c < nums[r].length; c++) {
        System.out.print(nums[r][c]);
        if (c != nums[r].length - 1) System.out.print(", ");
      }
      System.out.print("]");
      if (r != nums.length - 1) System.out.print(",");
      System.out.println();
    }
    System.out.println("}\n");
  }
}