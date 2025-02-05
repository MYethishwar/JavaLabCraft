// Extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class is running...");
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        // Creating an instance of MyThread
        MyThread myThread = new MyThread();
        
        // Starting the thread
        myThread.start();
    }
}
