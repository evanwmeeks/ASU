public class Main {
   public static void main (String[] args) {
      int[] myArray = {1,2,3,4,5};
      int[] result = oddAndEven(myArray);
      System.out.println("Odd Count: "+ result[0]);
      System.out.println("Even Count: "+ result[1]);
      
   }
   
   public static int[] oddAndEven(int[] a) {
      int oddCounter = 0;
      int evenCounter = 0;
      int[] result = new int[2];
      for (int i = 0; i < a.length; i++) {
         if (a[i] % 2 == 0) {
            evenCounter ++;
         }
         else { oddCounter ++;}
      }
      result[0] = oddCounter;
      result[1] = evenCounter;
      return result;
      
   }
   
}