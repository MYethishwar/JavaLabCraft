public class JumpingStatementsDemo {
    public static void main(String[] args) {
        // Using break statement
        System.out.println("Using break statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exit the loop when i is 5
            }
            System.out.println(i);
        }

        // Using continue statement
        System.out.println("\nUsing continue statement:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // skip the rest of the loop body for even numbers
            }
            System.out.println(i);
        }

        // Using return statement
        System.out.println("\nUsing return statement:");
        printNumbersUntil(5); // method will return when i equals 5
    }

    public static void printNumbersUntil(int limit) {
        for (int i = 1; i <= 10; i++) {
            if (i == limit) {
                return; // exit the method when i equals the limit
            }
            System.out.println(i);
        }
    }
}
