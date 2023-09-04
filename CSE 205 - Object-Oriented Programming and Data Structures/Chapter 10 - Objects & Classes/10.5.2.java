/**
   A simulated lock with digit buttons.
*/
public class Lock
{
   private String combination = "0042"; 
   private String input = "";
 
   /**
      Simulates a digit button push.
      @param button a digit 0 ... 9
   */
   public void push(int button)
   {
      /* Your code goes here */
      input = input + button;
      
   }
   
   /**
      Simulates a push of the open button.
      @return true if the lock opened
   */
   public boolean open()
   {
      /* Your code goes here */
      if (combination.equals(input)) {input = ""; return true;}
      else {input = ""; return false;}
   }
}