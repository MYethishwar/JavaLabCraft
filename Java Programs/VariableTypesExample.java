public class VariableTypesExample {

    // Instance variable (or non-static variable)
    int instanceVar = 10;

    // Class variable (or static variable)
    static String classVar = "Hello";

    public void methodWithLocalVariable() {
        // Local variable
        double localVar = 3.14;
        
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Class Variable: " + classVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableTypesExample obj = new VariableTypesExample();
        
        // Accessing instance variable through object
        System.out.println("Instance Variable accessed through object: " + obj.instanceVar);
        
        // Accessing class variable directly using class name
        System.out.println("Class Variable accessed directly: " + VariableTypesExample.classVar);
        
        // Calling method with local variable
        obj.methodWithLocalVariable();
    }
}
