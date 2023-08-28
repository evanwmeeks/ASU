public class Boxes
{
   public static void printBoxes(int n)
   {      
           
      if (n > 1) {
         System.out.print("[]");
         printBoxes(n - 1);
      } else {
         System.out.print("[]");
      }
   }
}