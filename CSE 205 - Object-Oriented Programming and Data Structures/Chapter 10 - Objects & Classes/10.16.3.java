/**
   This class models a ball that bounces off walls.
*/
public class Ball
{
   // Instance variables

   private int position;      
   private int velocity; 
   private int rightWall;
   
   /**
      Constructs a ball at position 0 traveling east.
      @param rightWall the position of the wall to the right
   */
   public Ball(int rightWall)
   {
      position = 0;
      velocity = 1; 
      this.rightWall = rightWall;
   }
 
   /**
      Moves the ball.
   */
   public void move()
   {
      position += velocity;

      
      if (position <= 0 || position >= rightWall) {
         
         velocity = -velocity;
      }
   }
 
   /**
      Gets the current position.
      @return the current position
   */
   public int getPosition()
   {
      return position;
   }
}