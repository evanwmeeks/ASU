import java.util.Iterator;
import java.util.LinkedList;

public class Lists
{
   public static String removeSecond(LinkedList<String> strings)
   {
      Iterator<String> iter = strings.iterator();
      String result = null;

      /* Your code goes here */
      if(strings.size()>=2)
      {
       iter.next(); 
       result = iter.next(); 
       iter.remove();
      }
      return result;
   }
}