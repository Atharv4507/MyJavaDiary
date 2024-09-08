package MyThread.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class S4_SheduledExecutor {

    public static void main(String[] args) {

        //1
        ExecutorService service = Executors.newScheduledThreadPool(2);
        for (int i = 0; i < 10; i++) {
            service.execute(new Work(i));
        }

        //2
        ScheduledExecutorService sexs = Executors.newScheduledThreadPool(1);
        sexs.scheduleAtFixedRate(new ProbeTask(), 1000, 2000, TimeUnit.MILLISECONDS); 
        try {
            if (!sexs.awaitTermination(10000, TimeUnit.MILLISECONDS)) {
                sexs.shutdown();
            }
        } catch (Exception e) {
            sexs.shutdown();
        }
        
    }
}

class Work implements Runnable{

    private final int workid;
    
    public Work(int workid) {
        this.workid = workid;
    }

    @Override
    public void run() {
        System.out.println("task id "+ workid+ " by Thread "+Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}

class ProbeTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Probe is running...");
    }
}