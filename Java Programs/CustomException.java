class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

class CustomExceptionExample {
    public void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age should be greater than or equal to 18.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}

public class CustomException {
    public static void main(String[] args) {
        CustomExceptionExample example = new CustomExceptionExample();
        
        try {
            example.validateAge(15);
        } catch (MyCustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
