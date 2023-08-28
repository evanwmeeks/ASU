// Below this comment: import the Scanner
import java.util.Scanner;

public class Initials {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      
      // Below this comment: declare any other variables you may need
      
      
      // Below this comment: collect the required inputs
      String input = scnr.nextLine();
      
      // Below this comment: call your required method
      String initials = getInitials(input);
      
      // Below this comment: disply the required results
      System.out.printf("Initials for %s : %s\n", input,  initials);
   }
   
   // define your required method here below
   public static String getInitials(String str) {
         String[] words = str.split(" ");
         String initials = "";
         for(String word : words){
            initials = initials + word.charAt(0) + ". ";
         }
         return initials.strip();
      }
   
}
