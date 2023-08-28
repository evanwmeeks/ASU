public class Main {
   
   public static void main (String[] args) {
      
      int[] myArray = {1,2,3,4,5};
      int[] result = maxAndMin(myArray);
      System.out.printf("Max: %d\n", result[0]);
      System.out.printf("Min: %d", result[1]);
   }
   
   public static int[] maxAndMin(int[] a) {
      
      int min = Integer.MAX_VALUE;
      int max = 0;
      int[] result = new int[2];
      for (int i = 0; i < a.length; i++) {
         if (a[i] > max) {
            max = a[i];
         }
         if (a[i] < min) {
            min = a[i];
         }
      }
      result[0] = max;
      result[1] = min;
      return result;
   }
}
         