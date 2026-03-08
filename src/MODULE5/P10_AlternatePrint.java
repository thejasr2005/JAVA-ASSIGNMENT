package MODULE5;

class AlternatePrint {
        int num = 1;

        synchronized void printNumbers() {
            while (num <= 10) {
                System.out.println(Thread.currentThread().getName() + " : " + num);
                num++;
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            notify();
        }
    }

    class TwoThreadsExample {
        public static void main(String[] args) {

            AlternatePrint obj = new AlternatePrint();

            Thread t1 = new Thread(() -> obj.printNumbers(), "Thread 1");
            Thread t2 = new Thread(() -> obj.printNumbers(), "Thread 2");

            t1.start();
            t2.start();
        }
    }
