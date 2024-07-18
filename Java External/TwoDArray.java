public class TwoDArray {
    public static void main(String[] args) {
        // Declaring a 2D array with 3 rows and 4 columns
        int[][] twoDArray = new int[3][4];

        // Initializing elements of the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twoDArray[i][j] = i + j; // Assigning values based on row and column indices
            }
        }

        // Accessing and printing elements of the 2D array
        System.out.println("Printing 2D Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
	System.out.println(); // Move to the next line after printing each row
            
        }
    }
}
