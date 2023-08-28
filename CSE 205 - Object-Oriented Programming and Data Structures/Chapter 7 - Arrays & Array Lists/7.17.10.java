public class TicTacToe
{
   /**
    * Return true if all elements on the diagonal joining the upper-left
    * and the lower-right corners all the same.
    * @param board a 3 x 3 array of String
    * @return true if all elements are the same.
    */
    public static boolean checkUpperLeftToLowerRight(String[][] board)
    {

        String diagonalElement = board[0][0];

        for (int i = 1; i < board.length; i++) {
            if (!board[i][i].equals(diagonalElement)) {
                return false; 
            }
        }

        return true;


   }
}