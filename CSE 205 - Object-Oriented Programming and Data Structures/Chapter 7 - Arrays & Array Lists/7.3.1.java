import java.util.Scanner;
import java.util.Arrays;

public class Numbers
{
   public static int multiply(int[] factors)
   {
      int product = 1;
      
            
      for (int number: factors)
      {
         product = product * number;
      }
      
            
      return product;
   }
}