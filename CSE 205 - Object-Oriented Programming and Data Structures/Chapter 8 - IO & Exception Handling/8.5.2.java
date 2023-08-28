import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   This program reads a file with numbers, and writes the numbers to another
   file, lined up in a column and followed by their average.
*/
public class Total
{
   public static void main(String[] args) throws FileNotFoundException
   {
      // Prompt for the input and output file names
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      System.out.print("Output file: ");
      String outputFileName = console.next();

      // Construct the Scanner and PrintWriter objects for reading and writing
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      PrintWriter out = new PrintWriter(outputFileName);
      // Read the input and write the output
      // Read the input and write the output
      
      /* Your code goes here */
      double average = 0;
      int counter = 0;
      double total = 0;

      while (in.hasNextDouble())
      {
         double value = in.nextDouble();
         out.printf("%17.2f\n", value);
         total = total + value;
         counter ++;
         average = total / counter;
      }
      
      
      /* Your code goes here */
      out.printf("Average: %8.2f\n", average);

      
      in.close();
      out.close();
   }
}