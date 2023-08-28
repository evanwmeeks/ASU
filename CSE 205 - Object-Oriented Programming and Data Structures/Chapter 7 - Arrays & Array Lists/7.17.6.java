public class Tables
{
   public static double evenElements(double[][] values)
   {
      int rows = values.length;
      int columns = values[0].length;
      int count = 0;

      
      for (int i = 0; i < rows; i++)
      {
         for (int j = 0; j < columns; j++) 
         {
            if (values[i][j] % 2 == 0) {
               count ++ ;
            }
         }
      }
            


      return count;
   }
}