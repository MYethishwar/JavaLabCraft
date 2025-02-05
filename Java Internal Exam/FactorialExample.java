public class FactorialExample {
    public static void main(String[] args) {
        int number = 5; // Change this number to calculate factorial for a different number
        long factorial = 1;

        // Calculate factorial
        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }

        // Display the factorial
        System.out.println("Factorial of " + number + " = " + factorial);
    }
}
