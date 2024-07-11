class Parent {
    void display() { // Changed method name from display to show
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() { // Changed method name from display to show
        super.display(); // Calling method from immediate parent class
        System.out.println("Child class method");
    }
    
    void anotherMethod() {
        super.display(); // Also possible to call from another method
    }
}

public class SuperClass {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Calls Child's overridden show method
        child.anotherMethod(); // Calls Parent's show method through Child's method
    }
}
