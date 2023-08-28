public class Main{
   
   public static void main(String[] args) {
      
      int[] myArray = {1,2,3,4,5};
      int result = countGreaterThanAverage(myArray);
      System.out.println("Result: " + result);
      
   }
   
   public static int countGreaterThanAverage(int[] a) {
      
      double avg = 0;
      double sum = 0;
      int counter = 0;
      for (int i = 0; i < a.length; i++ ) {
         
         sum = sum + a[i];
         
      }
      avg = sum / a.length;
      
      for (int i = 0; i < a.length; i++) {
         
         if ( a[i] > avg) {
            counter ++;
         }
      }
      return counter;
      
   }
   
}