public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double[] result = avgAndSum(array);

        System.out.println("Sum: " + result[0]);
        System.out.println("Average: " + result[1]);
    }

    public static double[] avgAndSum(int[] a) {
        double[] result = new double[2];
        double sum = 0;
        double avg = 0;
        double length = a.length;

        for (int i = 0; i < length; i++) {
            sum = sum + a[i];
        }
        avg = sum / length;

        result[0] = avg;
        result[1] = sum;
        return result;
    }
}
