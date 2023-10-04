public class Successors{
		
	public static Position findPosition(int num, int[][] intArr)
	{ 
    for (int i = 0; i < intArr.length; i++) {
      for (int j = 0; j < intArr[i].length; j++) {
        if (intArr[i][j] == num) {
          Position temp = new Position(i, j);
          return temp;
        }
      }
    }
    return null;
	}
	
	public static Position[][] getSuccessorArray(int[][] intArr)
	{ /* to be implemented in part (b) */ 
	  Position[][] temp = new Position[intArr.length][intArr[0].length];
    for (int i = 0; i < intArr.length; i++) {
      for (int j = 0; j < intArr[i].length; j++) {
        temp[i][j] = findPosition(intArr[i][j] + 1, intArr);
      }
    }
    return temp;
	}

}