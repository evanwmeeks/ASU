import java.util.ArrayList;
public class Main {
   
   public static void main(String[] args) {
      
      ArrayList<Integer> myList = new ArrayList<>();
      myList.add(1);
      myList.add(2);
      myList.add(3);
      myList.add(4);
      myList.add(5);
      int firstValue = 2;
      int secondValue = 4;
      ArrayList<Integer> results = inRange(myList, 2, 4);
      System.out.print(results);
      
   }
   
   public static ArrayList<Integer> inRange(ArrayList<Integer> a, int firstValue, int secondValue) {
      
      ArrayList<Integer> results = new ArrayList<>();
      
      
      for(int i = 0; i < a.size(); i++) {
         
         if(a.get(i) >= firstValue && a.get(i) <= secondValue) {
            results.add(a.get(i));
         }
         
      }
      
      return results;
      
   }
            
}