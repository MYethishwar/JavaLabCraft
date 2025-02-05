class MethodOverLoad {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two floats
    public float add(float a, float b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three doubles (return type should be double)
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverLoad math = new MethodOverLoad();
        System.out.println("Sum of 2 and 3: " + math.add(2, 3));
        System.out.println("Sum of 2, 3 and 4: " + math.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));
        System.out.println("Sum of 2.5, 3.5, and 4.5: " + math.add(2.5, 3.5, 4.5));
        System.out.println("Sum of 2.0f and 3.0f: " + math.add(2.0f, 3.0f));
    }
}
