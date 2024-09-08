package MyThread.ConcurrentCollection;

import java.util.concurrent.CountDownLatch;

/*CountDownLatch :-> Multiple Thread Perfrming Independant task, and you have to co-ordinate them before moving forward
 * Simmilar to join but more effecient cuz if you have dynamic Threads then it is not reliable to use join() that many time, 
 * it is more cleaner approch
 */

 /*when to use:
  * 
  */

public class Restraurant {
    public static void main(String[] args) throws InterruptedException{
        int NoOfChef = 3;
        CountDownLatch latch =new CountDownLatch(NoOfChef);
        new Thread(new chef("Chef A","Pizza",latch)).start();
        new Thread(new chef("Chef B", "Burger", latch)).start();
        new Thread(new chef("Chef C", "Idaly", latch)).start();
        latch.await();
        System.out.println("All dishes are ready! Let's Start serving customers");

    }
    
}

class chef implements Runnable{

    private final String name;
    private final String dish;
    private final CountDownLatch latch;

    
    public chef(String name, String dish, CountDownLatch latch) {
        this.name = name;
        this.dish = dish;
        this.latch = latch;
    }


    @Override
    public void run(){
        System.out.println(name + " is preparing "+dish);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+" has finished preparing "+dish);
        latch.countDown();
    }
}