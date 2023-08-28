import java.util.Scanner;

public class HelperMethods
{
   /**
      Gets the number of of times the character c appears in the string.
      @param str any string
      @param c the character to search for
      @return the number of times c appears in str
   */
   
   
   public static int countChar(String str, char c)
   {
      int count = 0;
      for (int i = 0; i < str.length(); i++)
      {
         if (str.charAt(i) == c) { count++; }

      }
      return count;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String line = in.nextLine();
      char letter = in.next().charAt(0);
      System.out.println(countChar(line, letter));
   }
}