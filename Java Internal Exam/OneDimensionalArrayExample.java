public class OneDimensionalArrayExample {
    public static void main(String[] args) {
        // Declaration and initialization of an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing elements of the array and printing them
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modifying an element of the array
        numbers[2] = 30;

        // Accessing and printing the modified array
        System.out.println("\nModified elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
