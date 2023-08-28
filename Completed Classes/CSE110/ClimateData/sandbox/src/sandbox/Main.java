package sandbox;

public class Main {
	public static void main(String[] args) {
//		Box myBox = new Box(10,5, 2);
//		if (myBox.isTall())
//		    System.out.println("Box is taller than it is wide or long");
//		else
//		    System.out.println("Box is not taller than it is wide and long");

	      int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10000000};
	      System.out.print(minPlusMax(array));
	    }
	      public static int minPlusMax(int[] x){
	        int min = x[0];
	        int max = x[0];
	        for(int i =0; i < x.length; i++){
	            if(x[i] > max){
	                max = x[i];
	            }
	            if(x[i] < min){
	                min = x[i];
	            }
	            }
	            return max + min;
	        }

}
