public class Bug
{
   private int position;

   /* Your code goes here */
   // Provide the getPosition and up methods
   public void up() {
      position += 10;
      
      if (position >= 100) {
         position = 0; }
         
   }

   public int getPosition() {
      return position;
   }
}