/**
   A rental car with static methods to count rented and available cars.
*/
public class RentalCar
{
   private boolean rented;
   private static int carsAvailable;
   private static int carsRented;
  
   /**
      Constructs a rental car.
   */
   public RentalCar()
   { 
       carsAvailable++;
       rented = false;
   }
 
   /**
      Get number of cars available.
      @return count of cars that are available
   */
   public static int numAvailable() 
   {
      /* Your code goes here */
      return carsAvailable;
   }
 
   /**
      Get number of cars rented.
      @return count of cars that are rented
   */
   public static int numRented() 
   {
      /* Your code goes here */
      return carsRented;
   }
 
   /**
      Try to rent this car.
      @return true if the car was successfully rented, false if it was already
      rented
   */
   public boolean rentCar() 
   {
      /* Your code goes here */
       if (!rented) {
         carsRented++;
         carsAvailable--;
         rented = true;
         return true;
      } else {
         return false;
      }
   }
 
   /**
      Return rented car.
      @return true if the car was previously rented and is now returned,
      false if it was not previously rented
   */
   public boolean returnCar()
   {
      /* Your code goes here */
      if (rented) {
         carsRented--;
         carsAvailable++;
         rented = false;
         return true;
      } else {
         return false;
      }
   }
}