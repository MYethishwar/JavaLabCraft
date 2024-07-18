public class StringMethods {

    public static void main(String[] args) {
        // Creating a string
        String str = "Hello, World!";

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Character at specific index
        char charAt5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAt5);

        // Substring from index 7 to end
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);

        // Concatenation with another string
        String concatStr = str.concat(" Welcome!");
        System.out.println("Concatenated string: " + concatStr);

        // Index of a character or substring
        int indexOfWorld = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);

        // Replace characters or substring
        String replacedStr = str.replace("Hello", "Hi");
        System.out.println("String after replacement: " + replacedStr);

        // Convert to uppercase
        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        // Convert to lowercase
        String lowercase = str.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        // Check if starts with a substring
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Check if ends with a substring
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWithWorld);
    }
}
