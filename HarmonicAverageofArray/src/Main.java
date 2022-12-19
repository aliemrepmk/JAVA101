public class Main {
    public static void main(String[] args) {
        int[] numbers = {34, 2, 11, 5};
        double harmonicSum = 0,len = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / (i+1);
        }

       
        System.out.printf("Harmonic Average of the array : %.2f" , (len/ harmonicSum));
    }
}