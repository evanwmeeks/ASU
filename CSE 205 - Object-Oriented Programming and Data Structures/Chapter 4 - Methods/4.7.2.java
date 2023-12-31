import java.util.Scanner;

public class BoxStringDemo
{
   public static void main(String[] args)
   {
      
      boxString("Hello");
      boxString("World");

   }

   /**
      Prints a string in a box.
      @param contents the string to enclose in a box
   */
   public static void boxString(String contents)
   {
      int n = contents.length();
      for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
      System.out.println();
      System.out.println("!" + contents + "!");
      for (int i = 0; i < n + 2; i++) { System.out.print("-"); }
      System.out.println();
   }
}