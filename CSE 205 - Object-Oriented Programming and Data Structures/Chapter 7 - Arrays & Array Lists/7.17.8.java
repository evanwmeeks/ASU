public class Data
{
   private int[][] values;

   /**
      Fills a given column of a two-dimensional array with a given value.
      @param column the column to fill
      @param fillValue the value to fill it with
   */
   public void fillColumn(int column, int fillValue)
   {


      for(int i = 0; i < values.length; i++) {
         values[i][column] = fillValue;
      }


   }

   public Data(int[][] data) { values = data; }
}