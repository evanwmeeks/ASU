import java.util.Iterator;
import java.util.LinkedList;

public class Lists
{
   public static String removeFirst(LinkedList<String> strings)
   {
      Iterator<String> iter = strings.iterator();
      String result = null;

      /* Your code goes here */
      if (!iter.hasNext())
      {
         return null;
      }
      result = strings.remove();

      return result;
   }
}