import java.util.Scanner;
public class TempConversion { 
   public static void main(String[] args) {
    // Below this comment: declare and instantiate a Scanner
    Scanner scnr = new Scanner(System.in);
      
    // Below this comment: declare any other variables you may need
    // to store the user's input and the Kelvin equivalent value
     

    // Below this comment: collect the requried inputs from the user
    System.out.print("Enter temperature in Fahrenheit :");
    double input = scnr.nextDouble();

    // Below this comment: call your FahrenheitToKelvin method
    double result = FahrenheitToKelvin(input);

    // Below this comment: disply the required results
    System.out.printf("%.2f degrees Fahrenheit is %.2f Kelvin\n", input, result);
          
   }
   
   // define your FahrenheitToKelvin method here below
   public static double FahrenheitToKelvin(double n) {
      double k = (n-32.0)*(5.0/9.0) + 273.15;
      return k;
   }
   
}