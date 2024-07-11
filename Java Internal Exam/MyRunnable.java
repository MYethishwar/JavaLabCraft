// Implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable is running...");
    }
}

public class MyRunnable {
    public static void main(String[] args) {
        // Creating an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        
        // Creating a Thread object with MyRunnable instance
        Thread thread = new Thread(myRunnable);
        
        // Starting the thread
        thread.start();
    }
}
