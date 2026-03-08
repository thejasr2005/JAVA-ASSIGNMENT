package MODULE5;

public class P6_thread extends Thread{
    public void run(){
        for(int i=0;i<10; i++){
            System.out.println("thread is running");
        }
    }
    static void main(String[] args) {
        P6_thread t1 = new P6_thread();
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread is running");
        }
    }
}


