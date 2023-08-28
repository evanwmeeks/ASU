public class ArrayUtils
{
   /**
    * Reverses the order of the elements in an array.
    * @param words an array of String to reverse.
    */

   public static String[] reverse(String[] words)
   {
      String[] result = new String[words.length];
   
   for (int i = 0; i < words.length; i++)
   {
      result[i] = words[words.length - 1 - i];
   }
   
   for (int i = 0; i < words.length; i++) {
      words[i] = result[i];
   }
   return words;
   }


}