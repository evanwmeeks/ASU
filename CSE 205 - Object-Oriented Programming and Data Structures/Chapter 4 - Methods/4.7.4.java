import java.util.Scanner;

public class BoxStringWithHelper
{
   /**
    * Prints a line of hyphens followed by a newline.
    * @param count the number of - characters to print.
    */

   
   public static void printLine(int n)
   {
      for (int i = 0; i <= n+3; i++) {System.out.print("-");}
      System.out.println();
      //for (int i = 0; i <= n; i++) {System.out.print("-");}
   }   

   /**
      Prints a string in a box.
      @param contents the string to enclose in a box
   */
   public static void boxString(String contents)
   {
      int n = contents.length();
      printLine(n);
      System.out.println("! " + contents + " !");
      printLine(n);
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String message = in.nextLine();
      boxString(message);
   }
}