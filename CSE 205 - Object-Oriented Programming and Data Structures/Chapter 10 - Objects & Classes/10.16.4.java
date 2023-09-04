/**
   This class models a ball that bounces off walls.
*/
public class Ball
{
   // Instance variables
      /* Your code goes here */
   private int xPosition;   
   private int yPosition;   
   private int rightWall;  
   private int topWall;    
   private int directionX; 
   private int directionY; 
   /**
      Constructs a ball at (0, 0) traveling northeast.
      @param rightWall the position of the wall to the right
      @param topWall the position of the wall at the top
   */
   public Ball(int rightWall, int topWall)   
   {
      /* Your code goes here */
      xPosition = 0;
      yPosition = 0;
      this.rightWall = rightWall;
      this.topWall = topWall;
      directionX = 1;  
      directionY = 1;
   }
 
   /**
      Moves the ball.
   */
   public void move()
   {
      /* Your code goes here */
      xPosition += directionX;
      yPosition += directionY;

      
      if (xPosition == rightWall || xPosition == 0) {
         turn(); 
      }
      if (yPosition == topWall || yPosition == 0) {
         turn(); 
      }
   }
 
   /**
      Turns the ball direction 90 degrees clockwise.
   */
   private void turn()
   {
      /* Your code goes here */
       int newDirectionX = directionY;  
      int newDirectionY = -directionX; 
      directionX = newDirectionX;
      directionY = newDirectionY;
   }
 
   /**
      Gets the current x-position.
      @return the x-position
   */
   public int getX()
   {
      /* Your code goes here */
      return xPosition;
   }
 
   /**
      Gets the current y-position.
      @return the y-position
   */
   public int getY()
   {
      return yPosition;
      /* Your code goes here */
   }
}