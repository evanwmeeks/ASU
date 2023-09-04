public class Segment implements Measurable
{
   /* Your code goes here */
   private double start = 0;
   private double finish = 0;
   
   public Segment(double from, double to) {
      start = from; 
      finish = to;
   }
   
   @Override
  public double getMeasure() {
    return Math.abs(start-finish);
  }

   
}