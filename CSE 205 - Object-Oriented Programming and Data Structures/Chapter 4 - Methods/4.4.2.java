import java.util.Scanner;

public class Methods
{
   /**
    * Return true when a number is even.
    * @param n the number to check
    * @return true when n is even.
    */
   public static boolean isEven(int n)
   {
       
      return n % 2 == 0;

   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.println(isEven(n));
   }
}