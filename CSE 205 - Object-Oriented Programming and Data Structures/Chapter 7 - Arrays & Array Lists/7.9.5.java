import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils 
{
   public static void main (String [] args) 
   {
      Scanner in = new Scanner(System.in);
      int length = in.nextInt();
      int values[] = new int[length];
      for (int i = 0; i < values.length; i++)
      {
         values[i] = in.nextInt();
      }
      /* Update the algorithm below */

      
      
     boolean firstPositive = true;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                if (!firstPositive) {
                    System.out.print(", ");
                }
                System.out.print(values[i]);
                firstPositive = false;
            }
         
      }



   }
}