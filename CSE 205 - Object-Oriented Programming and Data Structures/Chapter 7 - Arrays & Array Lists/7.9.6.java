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
      int numMatches = 0;

      
      /* Count the number of matches here */
       for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                numMatches++;
            }
        }
      
      int[] matches = new int[numMatches];
      
      /* Adapt the algorithm here */
      int matchesSize = 0;
      for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                matches[matchesSize] = values[i]; 
                matchesSize++;
            }
        }



      System.out.println(Arrays.toString(matches));
  }
}