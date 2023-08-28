import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Characters
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      in.useDelimiter("");
      int uppercase = 0;
      int lowercase = 0;
      int digits = 0;
      int whitespace = 0;
      int other = 0;


      while (in.hasNext())
      {
         
         char s = in.next().charAt(0);
         if (Character.isUpperCase(s)) { uppercase++; }
         else if (Character.isLowerCase(s)) { lowercase++; }
         else if (Character.isDigit(s)) { digits++; }
         else if (Character.isWhitespace(s)) { whitespace++; }
         else other++;
      }

      in.close();

      
      System.out.println("Uppercase: " + uppercase);
      System.out.println("Lowercase: " + lowercase);
      System.out.println("Digits: " + digits);
      System.out.println("Whitespace: " + whitespace);
      System.out.println("Other: " + other);
   }
}