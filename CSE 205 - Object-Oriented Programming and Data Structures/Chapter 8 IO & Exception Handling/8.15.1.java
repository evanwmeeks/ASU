import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Arithmetic
{
   /**
      This class reads a file containing arithmetic expressions and returns an 
      array list of the results. 
      @param filename the file name
      @return a list of results
   */
   
   public static ArrayList<Integer> read(String filename) throws IOException
   {


       File inFile = new File(filename);
      Scanner in = new Scanner(inFile);

      ArrayList<Integer> result = new ArrayList<Integer>();

      while (in.hasNextLine()) {
            int val1 = in.nextInt();
            String operator = in.next();
            String val2_String = in.next();
            boolean isNumeric = false;
            int val2 = 0;
            for(int i = 0; i < val2_String.length(); i++) {
               
               if(Character.isDigit(val2_String.charAt(i))) 
               {
                  isNumeric = true;
               }
            }
            if (!isNumeric) {
               throw new IOException();
               }
               
            else {
            val2 = Integer.parseInt(val2_String);
            }
            
            if (operator.equals("+")) {
               result.add(val1 + val2);
            }
            else if (operator.equals("-")) {
               result.add(val1 - val2);
            }
            else if (operator.equals("*")) {
               result.add(val1 * val2);
            }
            else {
               throw new IOException();
            }
      }

         in.close();
         return result;



   }
   // This method checks your work.
   
   public static String check(String filename)
   {
      try
      {
         return read(filename).toString();
      }
      catch (IOException ex)
      {
         return "I/O exception thrown";
      }
      catch (Exception ex)
      {
         return ex.getClass().getName();
      }
   }
   
   public static void main(String[] args) throws IOException
   {
      Scanner console = new Scanner(System.in);
      String inputFileName = console.nextLine();
      String result = check(inputFileName);
      System.out.println(result);        
   }
}   