import java.util.Iterator;
import java.util.LinkedList;

public class Lists
{
   public static void removeShort(LinkedList<String> words)
   {
      Iterator<String> iter = words.iterator();

      /* Your code goes here */
   while (iter.hasNext()) 
   {
   String st = iter.next();
   if(st.length()<4)
      {
         iter.remove();
      }

   }

   }
}