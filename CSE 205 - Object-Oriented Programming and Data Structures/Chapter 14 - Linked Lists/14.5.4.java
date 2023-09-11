import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;
public class Maps
{
   /**
      Returns a new map with merged key-value pairs.
      @param map1 the first map to compare
      @param map2 the second map to compare
      @return a map containing a set of entries in each map
   */
   public static Map<String, Set<Integer>> merge(Map<String, Integer> map1,
         Map<String, Integer> map2)
   {
      Map<String, Set<Integer>> merged = new TreeMap<>();

      /* Your code goes here */
      Set<String> allKeys = new TreeSet<>();
      allKeys.addAll(map1.keySet());
      allKeys.addAll(map2.keySet());
      
      for(String key:allKeys)
      {
         Set<Integer> values = new TreeSet<>();
         if(map1.containsKey(key))
         {
            values.add(map1.get(key));
         }
         if(map2.containsKey(key))
         {
            values.add(map2.get(key));
         }
         merged.put(key, values);
      }

      return merged;
   }
}