public class Comparables
{
   /**
      Swaps the smallest and largest value.
      @param values an array of values of a class that implements the
      Comparable interface
   */
   
   @SuppressWarnings("unchecked") // Needed for testing
   public static void swapMinAndMax(Comparable[] values)
   {

      Comparable max = values[0]; 
      Comparable min = values[0];
      int index1 = 0; 
      int index2 = 0;

      for (int i = 1; i < values.length; i++) {
         if (values[i].compareTo(max) > 0) {
            max = values[i];
            index1 = i; 
         }
         if (values[i].compareTo(min) < 0) {
            min = values[i];
            index2 = i; 
         }
      }

       if (index1 != index2) { 
         Comparable temp = values[index1];
         values[index1] = values[index2];
         values[index2] = temp;
      }


   }
}