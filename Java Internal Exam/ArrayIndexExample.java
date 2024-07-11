public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // Trying to access an index beyond the array length
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching and handling the exception
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
