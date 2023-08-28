import java.util.ArrayList;

public class Main {
   
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(4);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(3);
        myList.add(0);

        ArrayList<Integer> results = allDuplicates(myList);
        System.out.println(results);
    }

    public static ArrayList<Integer> allDuplicates(ArrayList<Integer> a) {
        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            int currentValue = a.get(i);
            boolean isDuplicate = false;
            
            for (int j = 0; j < i; j++) {
                if (a.get(j) == currentValue) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (isDuplicate && !results.contains(currentValue)) {
                results.add(currentValue);
            }
        }
        
        return results;
    }
}
