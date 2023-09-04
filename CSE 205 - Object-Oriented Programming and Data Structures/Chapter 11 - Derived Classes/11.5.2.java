/**
   A nervous critter moves back and forth between positions 0 and 1.
*/
public class NervousCritter extends Critter
{
   /* Your code goes here */
   private int position;
   
   public void act() {
      if (position == 1) {
         position = 0;
         addHistory("move to 0");
         }
      else{ position = 1;
      addHistory("move to 1");
      }
   
      
   }
}