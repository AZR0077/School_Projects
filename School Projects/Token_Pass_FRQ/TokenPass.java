public class TokenPass 
{ 
 private int[] board; 
 private int currentPlayer; 
 
 

 public TokenPass(int playerCount) 
 { 
   board = new int[playerCount];
   for (int i = 0; i < board.length; i++) {
     board[i] = (int)(Math.random() * 9 + 1);
   }
   currentPlayer = (int)(Math.random() * playerCount);
 } 
 
 

 public void distributeCurrentPlayerTokens() 
 { 
   int player = currentPlayer;
   int temp = board[currentPlayer] + 1;
   board[currentPlayer] = -1;
   while (temp != 0) {
     if (currentPlayer == board.length - 1) {
       board[currentPlayer]++;
       currentPlayer++;
       currentPlayer = 0;
       temp--;
     }
     else {
      board[currentPlayer]++;
      currentPlayer++;
      temp--;
     }
   }
   currentPlayer = player + 1;
 } 
 
 
 public void printInfo()
 {
	for(int i=0; i<board.length; i++)
	{
		System.out.print( "(p" + i + " : token " + board[i]  + ")" + ", ");
	}
	System.out.print("\nCurrent Player: " + currentPlayer + "\n");
 }
 
 public int getCurrentPlayer()
 {
 	return currentPlayer;
 }
 
 public int[] getBoard()
 {
 	return board;
 }
 
}