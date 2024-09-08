package MyThread.CallableInterFace;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException{
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> result =  service.submit(new Work());//used submit instead of execute cuz submit can work for callable as well as Runnable
        System.out.println(result.get(2,TimeUnit.SECONDS));
        System.out.println("Main Thread Execution Completed");
        result.cancel(true);
        boolean canceled = result.isCancelled();
        boolean done = result.isDone();
        if (canceled) {
            System.out.println("Thread is canceled");
        }
        if (done) {
            System.out.println("Thread is done");
        }
    }
}

class Work implements Callable<Integer>{ // Used instead of Runnable cuz wwe can't return value using runnable cuz it contain only one methood void run()

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return 12;
    }
    
}