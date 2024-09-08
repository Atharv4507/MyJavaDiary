package MyThread.Syncronization;

public class S1_SyncronizationDemo {
    private static int counter = 0;
    public static void main(String[] args) {
          /* Or we can just make one thread sleep for  some time so another can complete it's process
         but drawback is it's time consuming it wil make cpu wait for that much time.
         */ 
        Thread one = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increment();
            }
            
        });

        Thread two = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        one.start();
        two.start();

        try{
            // one.sleep(1000);
            // two.sleep(2000);
            one.join();
            two.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("counter Value: "+counter);

    }
    private synchronized static void increment(){
        counter++;
    }
  
    /*issues of syncronization on method block */

    /* If you see in syncronization only one process can be handle at a time.
     * Every class has one moniter and has one door and one passkey.
     * when one process completes it's task, it came out and gives passkey to another process.
     * so although if you creates multiple syncronized method block with different variables like here counter1 & counter2,
     * but it is working in same class so the time complexity of program will remain same.
    */
}

/* Let's follow this in next program */
