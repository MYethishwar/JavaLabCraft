public class StringConcatenationExample {
    public static void main(String[] args) {
        // Example strings
        String firstName = "John";
        String lastName = "Doe";

        // Concatenating strings using the + operator
        String fullName = firstName + " " + lastName;

        // Displaying the concatenated string
        System.out.println("Full Name: " + fullName);

        // Concatenating strings using the concat() method
        String message = "Hello, ".concat(firstName).concat("!");

        // Displaying the concatenated message
        System.out.println(message);
    }
}
