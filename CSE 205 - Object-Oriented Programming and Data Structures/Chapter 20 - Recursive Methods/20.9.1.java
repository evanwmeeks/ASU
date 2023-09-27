import java.util.Scanner;

/**
 * A recursive method that removes forbidden characters from a string.
 */
public class CleanUp
{
   public static String clean(String str, String forbidden)
   {
      if (str.isEmpty()) return str;
        String first = str.substring(0, 1);
        
        if (forbidden.contains(first))
        {
            return clean(str.substring(1), forbidden);
        } 
        else 
        {
            return first + clean(str.substring(1), forbidden);
        }
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      while (in.hasNext())
      {
         String str1 = in.next();
         String str2 = in.next();
         System.out.println(clean(str1, str2));
      }
   }
}