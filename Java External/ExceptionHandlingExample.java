public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Example for ArithmeticException
        try {
            int result = 10 / 0;  // Attempting to divide by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }

        // Example for ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3};
        try {
            System.out.println("Accessing element at index 3: " + numbers[3]);  // Accessing out-of-bounds index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
