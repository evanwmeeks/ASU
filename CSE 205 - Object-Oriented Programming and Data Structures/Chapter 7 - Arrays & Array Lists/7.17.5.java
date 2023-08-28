import java.util.ArrayList;

public class ArrayListUtil
{
   /**
      Finds the positions of all strings equal to a given string 
      in an array list of strings.
      @param words an array list of strings
      @param searchedWord the word to search for
      @return an array list of all matching positions
   */

   
   public static ArrayList<String> wordsOfLength(ArrayList<String> words, int wordLength)
   {
      ArrayList<String> newList = new ArrayList <String>();
      for(int i = 0; i < words.size(); i++) {
         if (words.get(i).length() == wordLength) {
            newList.add(words.get(i));
         }
      }
      return newList;
   }

}