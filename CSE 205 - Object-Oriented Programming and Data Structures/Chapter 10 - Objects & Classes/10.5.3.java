/**
   A simulated digital clock.
*/
public class Clock
{
   private int hours;
   private int minutes;
 
   /**
      Advances this clock to the next minute.
   */
   public void pulse()
   {
      /* Your code goes here */
      minutes ++;
      hours += minutes / 60;
      minutes %= 60;
      hours %=24;
      
   }
 
   /**
      Gets the hours of this clock.
      @return the hours (between 0 and 23)
   */
   public int getHours()
   {
      /* Your code goes here */
      return hours;
      
      
      
   }
 
   /**
      Gets the minutes of this clock.
      @return the minutes (between 0 and 59)
   */
   public int getMinutes()
   {
     /* Your code goes here */
     return minutes;
   }
}