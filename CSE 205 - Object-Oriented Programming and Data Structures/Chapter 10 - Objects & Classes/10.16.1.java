/**
   This class models a shuttle van.
*/
public class Van
{
   // Instance variables
   /* Your code goes here */
   private int maxPassengers; 
   private int passengers; 
   private double milesDriven; 
   /**
      Constructs a van with a given capacity.
      @param maxPassengers the maximum number of passengers that this
      van can hold
   */
   public Van(int maxPassengers)
   {
      /* Your code goes here */
      this.maxPassengers = maxPassengers;
      this.passengers = 0; 
      this.milesDriven = 0.0; 
   }

   /**
      Boards passengers up to the capacity of this van.
      @param boardingPassengers the number of passengers attempting
      to board
   */
   public void board(int boardingPassengers)
   {
      /* Your code goes here */
      int availableSeats = maxPassengers - passengers;
      int passengersBoarded = Math.min(availableSeats, boardingPassengers);
      passengers += passengersBoarded;
   }
 
   /**
      Drives the van and discharges the passengers.
      @param distance the distance driven
   */
   public void drive(double distance)
   {
      /* Your code goes here */
      milesDriven += distance;
      passengers = 0;
   }
 
   /**
      Gets the number of passengers in this van.
      @return the number of passengers
   */
   public int getPassengers()
   {
      /* Your code goes here */
      return passengers;
   }
 
   /**
      Gets the number of miles that this van has driven.
      @return the number of miles
   */
   public double getMilesDriven()
   {
      /* Your code goes here */
      return milesDriven;
   }
}