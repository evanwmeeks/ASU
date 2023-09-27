import java.util.Scanner;

/**
 * A recursive method that removes forbidden characters from a string.
 */
public class CleanUp
{
   public static String cleanHelper(String str, String forbidden, int index)
   {
     if(index < 0){
return str;
}
String current = Character.toString(str.charAt(index));
if(forbidden.contains(current)){
str = str.replace(current,"");
return cleanHelper(str,forbidden,str.length()-1);
}
else{
return cleanHelper(str,forbidden,index-1);
}
   }
   
   public static String clean(String str, String forbidden)
   {
      return cleanHelper(str, forbidden, str.length() - 1);
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      while (in.hasNext())
      {
         String str1 = in.next();
         String str2 = in.next();
         System.out.println(clean(str1, str2));
      }
   }
}