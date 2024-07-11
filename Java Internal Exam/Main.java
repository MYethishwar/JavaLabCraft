final class BaseClass {
    
    public void display() {
        System.out.println("This is a final class.");
    }
}


public class Main {
    public static void main(String[] args) {
        BaseClass obj = new BaseClass();
        obj.display();
    }
}
