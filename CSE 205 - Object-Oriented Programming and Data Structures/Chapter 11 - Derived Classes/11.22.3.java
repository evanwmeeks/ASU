public class Segment implements Moveable
{
   private double start;
   private double end;

   /**
      Constructs a linear segment.
      @param from the starting point
      @param to the ending point
   */
   public Segment(double from, double to)
   {
      start = from;
      end = to;
   }

   public String toString()
   {
      return start + "->" + end;
   }

   /* Your code goes here */

   public void move(double amount) {
        start += amount;
        end += amount;
   }

}