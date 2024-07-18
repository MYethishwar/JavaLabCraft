final class BaseClass {
    void displayMessage() {
        System.out.println("This method cannot be overridden.");
    }
}

// Uncommenting the below line will result in compilation error
// class DerivedClass extends BaseClass {}

public class PreventInheritanceExample {
    public static void main(String[] args) {
        BaseClass obj = new BaseClass();
        obj.displayMessage();
    }
}
