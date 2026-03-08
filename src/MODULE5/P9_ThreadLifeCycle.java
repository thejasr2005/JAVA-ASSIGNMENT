package MODULE5;

public class P9_ThreadLifeCycle extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000); // Thread goes to waiting state
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread execution finished.");
    }

    public static void main(String[] args) {

        P9_ThreadLifeCycle t1 = new P9_ThreadLifeCycle();

        System.out.println("State after creation: " + t1.getState());

        t1.start();
        System.out.println("State after start(): " + t1.getState());

        try {
            Thread.sleep(500);
            System.out.println("State during execution: " + t1.getState());

            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("State after completion: " + t1.getState());
    }
}

