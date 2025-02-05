import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter input suitable for nextLine() method");
        String my_string = sc.nextLine();
        
        System.out.println("Enter input suitable for next() method");
        String my_word = sc.next();
        
        System.out.println("Enter input suitable for nextInt() method");
        int my_integer = sc.nextInt();
        
        System.out.println("Enter input suitable for nextFloat() method");
        float my_float = sc.nextFloat();
        
        System.out.println("Enter input suitable for nextDouble() method");
        double my_double = sc.nextDouble();
        
        // Consume the leftover newline
       
        
        System.out.println("Your word is " + my_word);
        System.out.println("Your integer is " + my_integer);
        System.out.println("Your float is " + my_float);
        System.out.println("Your double is " + my_double);
        System.out.println("Your string is " + my_string);
        
        sc.close();
    }
}
