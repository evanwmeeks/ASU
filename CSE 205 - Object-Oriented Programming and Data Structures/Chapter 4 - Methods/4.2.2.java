import java.util.Scanner;

public class Methods
{
   /**
    * Computes the area of a square of a given side length.
    * @param sideLength the length of a side
    * @return the area of a square with side length.
    */

  
   public static Double squareArea(double sideLength)
   {
      return sideLength * sideLength;

   }
 
   public static void main (String[] args) 
   {
      Scanner in = new Scanner(System.in);
      double area = squareArea(in.nextDouble());
      System.out.println(area);
   }
}