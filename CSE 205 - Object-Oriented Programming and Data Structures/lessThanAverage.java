import java.util.ArrayList;
public class Main {
   
 public static void main(String[] args) {
    
    ArrayList<Integer> myList = new ArrayList<>();
   myList.add(1);
   myList.add(2);
   myList.add(3);
   myList.add(4);
   myList.add(5);

    
   ArrayList<Integer> results =  lessThanAverage(myList);
   System.out.println(results);
    
 }


public static ArrayList<Integer> lessThanAverage (ArrayList<Integer> a) {
   double sum = 0;
   double avg = 0;
   ArrayList<Integer> result = new ArrayList<Integer>();
   for(int i = 0; i < a.size(); i++) {
      sum = sum + a.get(i);
   }
   avg = sum / a.size();
   
   for(int i = 0; i < a.size(); i++) {
      if (a.get(i) < avg){
         result.add(a.get(i));
      }
   }
   return result;

}
   
}