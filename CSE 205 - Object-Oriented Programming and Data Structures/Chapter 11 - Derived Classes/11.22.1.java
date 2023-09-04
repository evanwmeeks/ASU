public class Measurables
{
   /**
      Swaps the values with the smallest and largest measure.
      @param objects an array of objects of a class that implements the
      Measurable interface.
   */
   public static void swapMinAndMax(Measurable[] objects)
   {
      double min = Double.POSITIVE_INFINITY; 
      double max = 0;
      int index1 = -1;
      int index2 = -1; 

      for (int i = 0; i < objects.length; i++) {
         if (objects[i].getMeasure() < min) {
            min = objects[i].getMeasure();
            index1 = i; 
         }
         if (objects[i].getMeasure() > max) {
            max = objects[i].getMeasure();
            index2 = i; 
         }
      }

      if (index1 != -1 && index2 != -1) {
         Measurable temp = objects[index1];
         objects[index1] = objects[index2];
         objects[index2] = temp;
      }
   }
}