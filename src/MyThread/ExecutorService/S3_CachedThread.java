package MyThread.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class S3_CachedThread {
    
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            service.execute(new Work(i));
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
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
