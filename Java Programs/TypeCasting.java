public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Typecasting (Widening Conversion)
        int myInt = 100;
        long myLong = myInt;  // Implicit casting from int to long
        float myFloat = myInt;  // Implicit casting from int to float
        double myDouble = myFloat;  // Implicit casting from float to double

        System.out.println("Implicit Typecasting:");
        System.out.println("int to long: " + myLong);
        System.out.println("int to float: " + myFloat);
        System.out.println("float to double: " + myDouble);

        // Explicit Typecasting (Narrowing Conversion)
        double myDouble2 = 123.456;
        float myFloat2 = (float) myDouble2;  // Explicit casting from double to float
        long myLong2 = (long) myDouble2;  // Explicit casting from double to long
        int myInt2 = (int) myDouble2;  // Explicit casting from double to int

        System.out.println("\nExplicit Typecasting:");
        System.out.println("double to float: " + myFloat2);
        System.out.println("double to long: " + myLong2);
        System.out.println("double to int: " + myInt2);
    }
}
