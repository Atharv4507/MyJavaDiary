package MyThread.Syncronization;

public class S3_WaitAndNotify {
    private static Object LOCK = new Object();

    public static void main(String[] args) {
        
        Thread one = new Thread(() -> {
            try {
                one();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread two = new Thread(() ->{
            try {
                two();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread three = new Thread(() ->{
            try {
                three();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        one.start();
        two.start();
        three.start();
    }
    private static void one() throws InterruptedException{
        synchronized(LOCK){
            System.out.println("Welecome to method one...");
            LOCK.wait();
            System.out.println("Back again with method one");
            LOCK.notify();
        }
    }

    private static void two() throws InterruptedException{
        synchronized(LOCK){
            System.out.println("Welecome to method two...");
            LOCK.wait();
            System.out.println("All in method two is completed.");
           
        }
    }

    private static void three() throws InterruptedException{
        synchronized(LOCK){
            System.out.println("Welecome to method three...");
            LOCK.notify();
            System.out.println("Back with method 3");
        }
    }
}
