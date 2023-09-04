/**
   A simulated traffic light.
*/
public class TrafficLight
{
   private int steps;
 
   /**
      Constructs a green traffic light.
   */
   public TrafficLight()
   {
      /* Your code goes here */
      steps = 0;
   }
 
   /**
      Constructs a traffic light.
      @param initialColor the initial color "green", "yellow", or "red"
   */
   public TrafficLight(String initialColor)
   {
      /* Your code goes here */
      if(initialColor.equals("green")) {steps = 0;}
      else if (initialColor.equals("yellow")) {steps = 1;}
      else {steps = 2;}
   }
 
   /**
      Moves this traffic light to the next color.
   */
   public void next()
   {
      steps++;
   }
 
   /**
      Returns the current color of this traffic light.
      @return the current color
   */
   public String getColor()
   {
      /* Your code goes here */
      int remainder = steps % 3;
      
      if (remainder == 0) {return "green";}
      else if (remainder == 1) {return "yellow";}
      else {return "red";}
   }
   
   /**
      Counts how often this traffic light has been red.
      @return the number of times this traffic light has been red
   */
   public int getReds()
   {
      /* Your code goes here */
      int count = 0;
      count = steps/3;
      if (steps%3 == 2)
         count++;
      return count;
   }
}