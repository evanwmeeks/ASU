import java.util.Scanner;

public class ShoutDemo
{

   
   public static void shout(String str)
   {
      System.out.println(str + "!!!");
   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String input1 = in.nextLine();
      String input2 = in.nextLine();
      
      shout(input1);
      shout(input2);

   }
}