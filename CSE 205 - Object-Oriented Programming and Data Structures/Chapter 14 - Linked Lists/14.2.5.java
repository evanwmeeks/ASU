import java.util.Iterator;
import java.util.LinkedList;

public class Lists
{
   public static void printSkipper(LinkedList<String> words)
   {
      Iterator<String> iter = words.iterator();

      /* Your code goes here */
      int counter = 0;
      while(iter.hasNext() && counter < words.size())
      {
         
         if (counter % 2 == 0) 
         {
            System.out.print(words.get(counter) + " ");
         }
         counter ++;
      }

      System.out.println();
   }
}