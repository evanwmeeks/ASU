import java.util.Set;
import java.util.Iterator;

public class Sets
{
   public static void printMatches(Set<String> s, Set<String> t)
   {
      System.out.print("{ ");

      /* Your code goes here */
      for(Object element:s)
      {
         if (t.contains(element))
         {System.out.print(element + " "); }
      }

      System.out.println("}");
   }
}