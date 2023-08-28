import java.util.ArrayList;

public class Main {
   
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);
        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(0);
        listTwo.add(2);
        listTwo.add(9);
        listTwo.add(3);
        

        ArrayList<Integer> results = inBoth(listOne, listTwo);
        System.out.println(results);
    }

    public static ArrayList<Integer> inBoth(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < listOne.size(); i++) {
            if (listTwo.contains(listOne.get(i)) && !results.contains(listOne.get(i))) {
                results.add(listOne.get(i));
            }
        }
        
        return results;
    }
}
