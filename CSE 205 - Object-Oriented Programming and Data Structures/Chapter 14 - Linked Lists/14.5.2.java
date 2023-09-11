import java.util.Map;
public class Maps
{
   /**
      Looks up a color name and returns the color code.
      @param color the name of the color, like "red"
      @param codes a Map where the color name is the key
      @return the HTML color code if it is in the table, or
      the color name if it is not
   */
   public static String getColorCode(String color, Map<String, String> codes)
   {
      
      /* Your code goes here */
      if(!codes.containsKey(color))
      {
         return color;  
      }
      return codes.get(color);

   }
}