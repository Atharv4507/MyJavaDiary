package MyThread.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class S5_CpuIntensiveTask {
    public static void main(String[] args) {
        int cors = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(cors);
        System.out.println("Created Thread Pool With: "+ cors + " cors");
        for (int i = 0; i < 20; i++) {
            service.execute(new CpuTask());
        }

    }
}

class CpuTask implements Runnable{
    @Override
    public void run(){
        System.out.println("Some Cpu intensive task being done by "+Thread.currentThread().getName());
    }
}