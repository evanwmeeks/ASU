import java.util.Scanner;

public class Strings
{
   /**
      Returns a string of asterisks of the same length as 
      a given string.
      @param str a string such as "secret"
      @return a string with each character of str changed to a *,
      such as "******".
   */
   public static String hideCharacters(String str)
   {

      /* Your code goes here */
      /* Your code goes here */
      String newString = "";
      for (int i=0; i<str.length(); i++) 
      {
         newString += "*";
      }
      return newString;


   }
   
   public static void main (String[] args) 
   {
      Scanner in = new Scanner(System.in);
      String starStr = hideCharacters(in.nextLine());
      System.out.println(starStr);  
   }
}