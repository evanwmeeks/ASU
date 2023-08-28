public class Tables
{
   public static double cornerAverage(double[][] values)
   {
      int rows = values.length;
      int columns = values[0].length;
      double sum = 0;
      sum = values[0][0] + values[0][values[0].length-1] + values[values.length-1][0] + values[values.length-1][values[0].length-1];
      return sum / 4;
   }
}