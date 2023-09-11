import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Frequency
{
   public static Map<String, Integer> letterFrequency(String str)
   {
      Map<String, Integer> m = new TreeMap<>();
      String ch;
      /* Your code goes here */
      for (int i = 0; i < str.length(); i ++) 
      {
         ch = "" + str.charAt(i);
         if(!m.containsKey(ch))
         {
            m.put(ch, 0);
         }
         m.put(ch,m.get(ch)+1);
      }
       
      return m;
   }
      
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String input = in.nextLine();
      
      System.out.println(Frequency.letterFrequency(input));
   }
}