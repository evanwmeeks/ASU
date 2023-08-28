import java.util.Arrays;

public class RemoveTester
{
   public static int removeOdd(int[] values, int size) 
   { 
      
      int newSize = 0;
      for (int i = 0; i < size; i++) 
      {
         if (values[i] % 2 == 0) 
         {
            values[newSize] = values[i];
            newSize++;
         }
      }
      return newSize;

   }
   public static void main(String[] args)
   {
      int[] a = { 22, 98, 95, 46, 31, 53, 82, 24, 11, 19 };
      int sizeBefore = 8;
      int sizeAfter = removeOdd(a, sizeBefore);
      System.out.print("a: [ ");
      for (int i = 0; i < sizeAfter; i++) 
      {
         System.out.print(a[i] + " ");
      }
      System.out.println("]");
      System.out.println("Expected: [ 22 98 46 82 24 ]");      

      int[] b = { 23, 97, 95, 45, 31, 53, 81, 24, 11, 19 };
      sizeBefore = 7;
      sizeAfter = removeOdd(b, sizeBefore);
      System.out.print("b: [ ");
      for (int i = 0; i < sizeAfter; i++) 
      {
         System.out.print(b[i] + " ");
      }
      System.out.println("]");
      System.out.println("Expected: [ ]");      
   }
}