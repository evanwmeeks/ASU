public class ArrayUtils
{
   /**
    * Returns an array with the elements in reversed order.
    * @param words an array of String.
    * @return a new array as described here.
    */
 
   public static String[] reverse(String[] words)
   {
      String[] result = new String[words.length];
      int counter = words.length-1;
      for (int i = 0; i < words.length; i++)
      {
         result[i] = words[counter];
         counter --;
      }
      return result;
   }
   
   
}