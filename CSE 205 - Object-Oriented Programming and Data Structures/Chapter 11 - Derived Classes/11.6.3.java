import java.util.ArrayList;

public class CountingArrayList extends ArrayList<String>
{
  /* Your code goes here */
  private int getCounter = 0;
  private int setCounter = 0;
  
  public String get(int index) {
   getCounter++;
   return super.get(index);
  }
  
  public String set(int index, String element) {
   setCounter ++;
   return super.set(index, element);
  }
   
   /**
      Gets the counter of get or set operations.
      @param what "get" or "set"
      @return the number of get or set operations invoked on this array list.
   */
   public int count(String what) 
   { 
      /* Your code goes here */
      if (what.equals("get")) {
         return getCounter;
      }
      return setCounter;
   }
}