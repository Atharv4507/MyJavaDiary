package MyThread.Syncronization;

import java.util.ArrayList;
public class S4_CunsumerProducer {

    public static void main(String[] args) {
        
        Worker w1 = new Worker(5, 0);

        Thread producer = new Thread(()->{
            try {
                w1.producer();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                w1.counsumer();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}

class Worker{

    private int sequence = 0;
    private final Integer top;
    private final Integer bottom;
    private final ArrayList<Integer> container;
    private final Object lock = new Object();

    public Worker(Integer top, Integer bottom){
        this.top = top;
        this.bottom = bottom;
        this.container = new ArrayList<>();
    }
    public void producer() throws InterruptedException{
        synchronized(lock){
            while (true) {
                if (container.size() == top) {
                    System.out.println("Container is Full, Waitting for it to be empty....");
                    lock.wait();
                }
                else{
                    System.out.println(sequence + " adding in container!");
                    lock.notify();
                    container.add(sequence++);

                }
                Thread.sleep(500);
            }
        }
    }
    public void counsumer() throws InterruptedException{
        synchronized(lock){
            while(true){
                if (container.size() == bottom) {
                    System.out.println("Container is Empty, Waitting for is to be Full....");
                    lock.wait();
                }
                else{
                    System.out.println(container.remove(0) + " removing from conatiner!");
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

}