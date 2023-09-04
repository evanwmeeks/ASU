import java.util.ArrayList;
 
/**
   This class models a shuttle van.
*/
public class Van
{
   // Instance variables
   /* Your code goes here */
   private int maxPassengers; 
   private ArrayList<String> passengers;
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
      this.passengers = new ArrayList<>();
      this.milesDriven = 0.0;
   }
 
   /**
      Boards a passenger up to the capacity of this van.
      @param name the name of the passenger attempting
      to board
   */
   public void board(String name)
   {
      /* Your code goes here */
      if (passengers.size() < maxPassengers) {
         passengers.add(name);
      }
   }
 
   /**
      Drives the van and discharges the passengers.
      @param distance the distance driven
   */
   public void drive(double distance)
   {
      /* Your code goes here */
      milesDriven += distance;
      passengers.clear();
   }
 
   /**
      Gets the passengers in this van.
      @return a list of passengers
   */
   public ArrayList<String> getPassengers()
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