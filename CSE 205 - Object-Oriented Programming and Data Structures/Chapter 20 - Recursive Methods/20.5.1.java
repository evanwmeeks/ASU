import java.util.Scanner;

public class PowerTwo
{
   public static int pow2(int n)
   {

   if (n<0) return -1;
    else if (n==0) return 1;
    else return 2*pow2(n-1);

   }
   
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      while (in.hasNextInt())
      {
         int exponent = in.nextInt();
         System.out.println(pow2(exponent));
      }      
   }
}