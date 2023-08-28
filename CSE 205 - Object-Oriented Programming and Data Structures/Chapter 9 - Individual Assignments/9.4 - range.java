public class Main {
   
   public static void main(String[] args) {
      int[] myArray = {1,2,3,4,5};
      int result = range(myArray);
      System.out.println("Range: " + result);
      
   }
   
   public static int range (int[] a) {
      int min =a[0];
      int max = a[0];
      for(int i = 0; i < a.length; i++) {
         min = Math.min(a[i], min);
         max = Math.max(a[i], max);
      }
      return Math.abs(max - min);
   }
   
}