public class BoxStringModification
{
   /**
      Prints a string in a box.
      @param contents the string to enclose in a box
   */

   public static void boxString(String contents)
   {
      int n = contents.length();
      
      
      for (int i = 0; i < n + 4; i++) { System.out.print("-"); }
      System.out.println();
      System.out.println("! " + contents + " !");
      for (int i = 0; i < n + 4; i++) { System.out.print("-"); }


      System.out.println();
   }
   
   public static void main(String[] args)
   {
      boxString("Hello");
      boxString("World");
   }
}