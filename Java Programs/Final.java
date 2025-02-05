// Parent class with final method
class Parent {
    // Final method that cannot be overridden
    final void display() {
        System.out.println("This method cannot be overridden.");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create an object of Parent class
        Parent parent = new Parent();

        // Call final method
        parent.display();
    }
}
