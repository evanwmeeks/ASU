import java.util.ArrayList;

public class Numbers
{
   public static ArrayList<Integer> negativePositions(ArrayList<Double> values)
   {

      ArrayList<Integer> result = new ArrayList<>();
      for (int i = 0; i < values.size(); i++) {
            if (values.get(i) < 0) {
                result.add(i);
            }
      }


      return result;
   }
}