// Parent class
class Parent {
    void displayParent() {
        System.out.println("Hey Programmer, I'm in the Parent Class");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    void displayChild() {
        System.out.println("Hey Programmer, I'm in the Child Class");
    }
}

// GrandChild class inheriting from Child
class GrandChild extends Child {
    void displayGrandChild() {
        System.out.println("Hey Programmer, I'm in the GrandChild Class");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        obj.displayGrandChild(); // Method from GrandChild class
        obj.displayChild();      // Method from Child class (inherited)
        obj.displayParent();     // Method from Parent class (inherited)
    }
}
