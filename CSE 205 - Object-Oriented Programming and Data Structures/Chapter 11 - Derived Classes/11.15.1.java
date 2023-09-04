/**
   A quarter with a state theme.
*/
public class StateQuarter extends Coin
{
   // Type your code here
   String stateName;
   
   /**
      Constructs a state quarter.
      @param aState the state name
   */
   public StateQuarter(String aState) 
   {
      super(0.25, "Quarter");
      // Type your code here
      stateName = aState;
     
   }
   
   /**
      Gets the description of this object.
      @return a description of this coin
   */
   public String toString()
   {
      // Type your code here
      return super.toString() + "[state=" + stateName + "]";
   }
}