public class Main {
   public static void main(String[] agrs) {
      // you may write code in this main method to test your required method
      int result = DiffMinMax(50, 100, 10);
      System.out.println(result);
   }
   
   // define your required method here below
   public static int DiffMinMax(int x, int y, int z){
      int maximum, minimum;

    if (x >= y && x >= z) {
        maximum = x;
        minimum = (y <= z) ? y : z;
    } else if (y >= z) {
        maximum = y;
        minimum = (x <= z) ? x : z;
    } else {
        maximum = z;
        minimum = (x <= y) ? x : y;
    }

    return maximum - minimum;
   }
}
