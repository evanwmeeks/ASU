import java.util.Scanner;

public class HelperMethods
{
   /**
      Gets the number of spaces in a string.
      @param str any string
      @return the number of spaces in str
   */

   
   public static int countSpaces (String str) {
      int count = 0;
      for (int i = 0; i <= str.length()-1; i++)
      {
         if(str.charAt(i)==' ') {
            count ++;
         }
      }
      return count;
   }


   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String line = in.nextLine();
      System.out.println(countSpaces(line));
   }
}