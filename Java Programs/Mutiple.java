// Interface defining methods related to a vehicle
interface Vehicle {
    void start();
    void stop();
}

// Interface defining methods related to a camera
interface Camera {
    void capturePhoto();
    void recordVideo();
}

// Class implementing both Vehicle and Camera interfaces

class Car implements Vehicle, Camera {
    // Vehicle interface methods
    public void start() {
        System.out.println("Car started.");
    }
    
    public void stop() {
        System.out.println("Car stopped.");
    }
    
    // Camera interface methods
    public void capturePhoto() {
        System.out.println("Photo captured.");
    }
    
    public void recordVideo() {
        System.out.println("Video recording started.");
    }
    
    // Additional method specific to Car class
    void drive() {
        System.out.println("Car is being driven.");
    }
}

public class Mutiple {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        // Using methods from Vehicle interface
        myCar.start();
        myCar.stop();
        
        // Using methods from Camera interface
        myCar.capturePhoto();
        myCar.recordVideo();
        
        // Using method specific to Car class
        myCar.drive();
    }
}
