public class Address implements Comparable
{
   private String street;
   private int houseNumber;

   /**
      Constructs an address.
      @param aStreet the street name
      @param aHouseNumber the house number
   */
   public Address(String aStreet, int aHouseNumber)
   {
      street = aStreet;
      houseNumber = aHouseNumber;
   }

   public String toString()
   {
      return houseNumber + " " + street;
   }

      /* Your code goes here */
      public int compareTo( Object address) {
        Address otherAddress = (Address) address;
         if(!street.equals(otherAddress.street)){
            return street.compareTo(otherAddress.street);
         }
         else{
            return Integer.compare(houseNumber, otherAddress.houseNumber);
         }
      }

}