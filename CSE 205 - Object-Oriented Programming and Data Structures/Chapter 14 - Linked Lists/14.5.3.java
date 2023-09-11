import java.util.Map;
import java.util.TreeMap;
public class Maps
{
   /**
      Returns a new map with common key-value pairs.
      @param map1 the first map to compare
      @param map2 the second map to compare
      @return a map containing entries common to both maps
   */
   public static Map<String, Integer> getCommon(Map<String, Integer> map1,
         Map<String, Integer> map2)
   {
      Map<String, Integer> common = new TreeMap<>();

      /* Your code goes here */
      for(String key: map1.keySet())
      {
         if(map2.containsKey(key) && map1.get(key).equals( map2.get(key)))
         {
            common.put(key, map1.get(key));
         }
      }

      return common;
   }
}
