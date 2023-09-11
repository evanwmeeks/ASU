import java.util.Queue;
public class Queues
{
   /**
      Returns the largest number from the queue.
      The queue has the same contents after the call.
   */
   public static Integer getLargest(Queue<Integer> q)
   {

      /* Your code goes here */
      int max = 0;
      
      for(Integer obj: q)
      {
         if (obj > max)
         {
            max = obj;
         }
      }
      return max;

   }
}