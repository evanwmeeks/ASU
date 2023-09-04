/**
   A simulated digital clock.
*/
public class Clock
{
   private int minutesFromMidnight;
 
   /**
      Advances this clock to the next minute.
   */
   public void pulse()
   {
    
    minutesFromMidnight++;
      
   }
 
   /**
      Gets the hours of this clock.
      @return the hours (between 0 and 23)
   */
   public int getHours()
   {
      /* Your code goes here */
      int temp =  (minutesFromMidnight / 60);
      if (temp > 23) { return 0;}
      return temp;
   }
 
   /**
      Gets the minutes of this clock.
      @return the minutes (between 0 and 59)
   */
   public int getMinutes()
   {
      /* Your code goes here */
      return (minutesFromMidnight % 60);
   }
}