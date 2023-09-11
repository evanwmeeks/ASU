import java.util.Iterator;
import java.util.LinkedList;

public class Lists
{
   public static String removeLast(LinkedList<String> strings)
   {
      Iterator<String> iter = strings.iterator();
      String result = null;

      /* Your code goes here */
      if (strings.size() == 0) 
      {
         return null;
      }
      while(iter.hasNext()) 
      {
         iter.next();
      }
      result = strings.getLast();
      iter.remove();
      

      return result;
   }
}