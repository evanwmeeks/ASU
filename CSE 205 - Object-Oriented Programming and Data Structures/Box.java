import java.util.Scanner;

public class Box {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double width = 0;
      double height = 0;
      String border = "";
      String interior = "";
      
      System.out.print("Enter width    :");
      width = scnr.nextDouble();
      System.out.print("Enter height   :");
      height = scnr.nextDouble();
      System.out.print("Enter border   :");
      border = scnr.next();
      System.out.print("Enter interior :");
      interior = scnr.next();
      System.out.println();
      
      
      for (int i = 0; i < width; i++) {
         System.out.print(border);
      }
      System.out.println();
      
      
      for (int j = 2; j <= height - 1; j++) {
         System.out.print(border);
         for (int k = 2; k <= width - 1; k++) {
            System.out.print(interior);
         }
         System.out.print(border);
         System.out.println();
      }
      
      
      for (int i = 0; i < width; i++) {
         System.out.print(border);
      }
   }
}
