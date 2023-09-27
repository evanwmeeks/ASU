import java.util.Scanner;

public class Poultry
{
   public static int hens(int n)
   {
      if(n==0)
return 0;
else
return hens(n-1)+chickens(n-1);
}
public static int chickens(int n)
{if(n==0)
return 0;
else
return eggs(n-1);
}
public static int eggs(int n)
{if(n==0)
return 1;
else
return hens(n-1);
   }
   
   public static void main (String [] args)
   {
      Scanner in = new Scanner(System.in);
      String animal = in.nextLine();
      int n = in.nextInt();
      int num;
      if (animal.equals("hens"))
      {
         num = hens(n);
      }
      else if (animal.equals("chickens"))
      {
         num = chickens(n);
      }
      else // eggs
      {
         num = eggs(n);
      }
      System.out.println(num);
   }
}