import java.util.ArrayList;

public class ArrayListUtil
{
   /**
      Removes adjacent duplicates from an array list of strings.
      @param word an array list of strings
   */
   public static void removeAdjacentDuplicates(ArrayList<String> words)
   {
      if (words.isEmpty()) {
            return; 
        }

        ArrayList<String> result = new ArrayList<>();
        result.add(words.get(0)); 

        for (int i = 1; i < words.size(); i++) {
            if (!words.get(i).equals(words.get(i - 1))) {
                result.add(words.get(i)); 
            }
        }

        words.clear(); 
        words.addAll(result);
    
   }
}