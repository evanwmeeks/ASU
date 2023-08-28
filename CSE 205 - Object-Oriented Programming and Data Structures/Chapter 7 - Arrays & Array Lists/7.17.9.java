import java.util.ArrayList;

public class Strings
{
   public static void swapFirstLast(ArrayList<String> names)
   {


      if (names.size() >= 2) {
            String first = names.get(0);
            String last = names.get(names.size() - 1);

            names.set(0, last);
            names.set(names.size() - 1, first);
        }
        
    


   }
}