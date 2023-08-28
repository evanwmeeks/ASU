import java.util.Scanner;

public class FindLast {
   public static void main (String [] args) {
      String[] words = { "Mary", "had", "a", "little", "lamb",
                         "it's", "fleece", "was", "white", "as",
                         "snow" };
            
      Scanner in = new Scanner(System.in);
      System.out.print("Word length: ");
      int wordLength = in.nextInt();
            boolean found = false;
      int pos = words.length-1; 
      while (pos >=0 && !found)
      {
         if (words[pos].length() == wordLength)
         {
            found = true;
         }
         else
         {
            pos--;
         }
      }

      if (found)
      {
         System.out.println("Found " + words[pos] + " at position " + pos);
      }
      else
      {
         System.out.println("No word of length " + wordLength);
      }
   }
}