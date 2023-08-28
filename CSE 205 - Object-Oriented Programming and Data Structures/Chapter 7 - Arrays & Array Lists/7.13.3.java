public class ArrayUtil
{
   /**
      Computes the sum of a given row in a two-dimensional array. 
      @param values the array
      @param the row whose sum to compute
      @return the sum of the given row
   */
      
   
   public static int rowSum(int[][] values, int row) 
   {
      int sum = 0;
      for (int i = 0; i < values[row].length; i++) 
      {
         sum = sum + values[row][i];
      }
      return sum;
   }
   
}