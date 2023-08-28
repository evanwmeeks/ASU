import java.util.Scanner;

public class Strings
{
   public static String everySecond(String s)
   {
            if (s.length() <= 1)
      {
         return s;
      }
      else
      {
         String simpler = everySecond(s.substring(2));
         return s.charAt(0) + simpler;
      }
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String word = in.nextLine();
      System.out.println(everySecond(word));
   }
}