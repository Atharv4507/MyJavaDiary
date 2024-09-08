package MyThread;

public class DemonUserThread {
    public static void main(String[] args) {
        Thread dThread = new Thread(new DemonThread());
        Thread uThread = new Thread(new UserThread());
        dThread.setDaemon(true);

        dThread.start();
        uThread.start();
    }
}

class DemonThread implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (count < 20) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println("DemonThread is Running...");
        }
    }

}

class UserThread implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (count < 3) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println("User Thread Implimentation complete....");
        }
    }

}