public class Bug
{
   private String climbed = "";

   /* Your code goes here */
   // Provide the getPosition and up methods
   public void up() {
      climbed += "-";
      if (climbed.length() >=10) {
         climbed = ""; }
         
      
   }

   public int getPosition() {
      return climbed.length() * 10;
   }
}