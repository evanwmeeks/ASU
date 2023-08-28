import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program reads a file with numbers, and writes the numbers to another
   file, lined up in two columns, and followed by the total.
*/
public class Total
{
   public static void main(String[] args) throws FileNotFoundException
   {
      // Prompt for the input and output file names
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      String outputFileName = "out.txt";

      // Construct the Scanner and PrintWriter objects for reading and writing
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      PrintWriter out = new PrintWriter(outputFileName);

      // Read the input and write the output
      double total = 0;

      while (in.hasNextDouble())
      {
         double value = in.nextDouble();
          out.printf("%8.2f", value);
          total = total + value;
         if(!in.hasNext())
         {
         out.println();}
          else{
          double nextValue = in.nextDouble();
          total = total + nextValue;
          out.printf("%8.2f\n", nextValue);}
          
      }


      out.printf("Total: %10.2f\n", total);
      in.close();
      out.close();
   }
}