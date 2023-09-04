/**
   A sloth eats and sleeps.
*/

public class Sloth extends Critter
{
   /* Your code goes here */
   private boolean sleeping;
   private boolean eating;
   

   public  Sloth()
   {
      sleeping = false;
      eating = true;
   }

   public void act() {
      if (eating) {
         eating = false;
         sleeping = true; 
         addHistory("eat");
      }
      else {
         eating = true;
         sleeping = false;
         addHistory("sleep");
         
      }
   }
}