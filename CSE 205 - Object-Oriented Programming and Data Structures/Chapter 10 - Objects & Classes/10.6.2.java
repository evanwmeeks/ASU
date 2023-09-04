/**
   A simulated traffic light.
*/
public class TrafficLight
{
   private String color;
   private int reds;
   /**
      Constructs a green traffic light.
   */
   public TrafficLight()
   {
      /* Your code goes here */
      color = "green";
      reds = 0;
   }
   
   /**
      Constructs a traffic light.
      @param initialColor the initial color "green", "yellow", or "red"
   */
   public TrafficLight(String initialColor)
   {
      /* Your code goes here */
      this.color = initialColor;
      if (this.color.equals( "red")) {reds++;}
   }
 
   /**
      Moves this traffic light to the next color.
   */
   public void next()
   {
      /* Your code goes here */
      if (this.color.equals( "red")) {this.color = "green";}
      else if (this.color.equals("green")) {this.color = "yellow";}
      else {this.color = "red"; reds ++;}
   }
 
   /**
      Returns the current color of this traffic light.
      @return the current color
   */
   public String getColor()
   {
      /* Your code goes here */
      return this.color;
   }
   
   /**
      Counts how often this traffic light has been red.
      @return the number of times this traffic light has been red
   */
   public int getReds()
   {
      /* Your code goes here */
      return this.reds;
   }
}