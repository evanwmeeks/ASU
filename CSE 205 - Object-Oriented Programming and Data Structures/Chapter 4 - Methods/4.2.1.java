import java.util.Scanner;

public class Names
{
   /**
      Changes a name so that the last name comes first.
      If name has no spaces, it is returned without change.
      @param name a name such as "Mary Jane Lee"
      @return the reversed name, such as "Lee, Mary Jane". 
   */
   public static String lastNameFirst(String name)
   {

            int lastSpaceIndex = name.lastIndexOf(" ");
      if (lastSpaceIndex > 0)
      {
      String lastName = name.substring(lastSpaceIndex + 1);
      String firstName = name.substring(0, lastSpaceIndex);
      return lastName + ", " + firstName;
      }
      else 
      {
         return name;
      }


   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String name = in.nextLine();
      System.out.println(lastNameFirst(name));
   }
}