public class Numbers
{
   public static void swapFirstLast(int[] values)
   {

      if (values.length > 0){
      int temp = values[values.length-1];
      values[values.length-1] = values[0];
      values[0] = temp;
      }
      


   }
}