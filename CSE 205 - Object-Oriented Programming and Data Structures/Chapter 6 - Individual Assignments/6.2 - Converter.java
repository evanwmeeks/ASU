import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        double meters = scnr.nextDouble();

        String result = MetersToFeetAndInches(meters);

        System.out.printf("%.2f meters in Feet and Inches is: %s", meters, result);
    }

    public static String MetersToFeetAndInches(double meters) {
        double totalInches = meters * 39.37;
        int feet = (int) (totalInches / 12); 
        double remainingInches = totalInches - (feet*12);
        return String.format("%d' %.2f\"", feet, remainingInches);
    }
}
