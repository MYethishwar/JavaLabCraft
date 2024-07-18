public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 3: " + numbers[3]); // Accessing index 3 which doesn't exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Array is null.");
        } finally {
            System.out.println("Finally block executed.");
        }
        
        System.out.println("Program continues...");
    }
}
