public class TicTacToe
{
   /**
    * Return true if all elements in col are the same.
    * @param board a 3 x 3 array of String
    * @param col the column to check
    * @return true if all elements are the same.
    */
    public static boolean checkCol(String[][] board, int col)
    {
     
       String firstItem = board[0][col];
       
       for (int i = 0; i < board.length; i++) 
       
       {
          
          if (!board[i][col].equals(firstItem)) {
             
             return false;
          }

       }
         
       
      return true;

    }
}