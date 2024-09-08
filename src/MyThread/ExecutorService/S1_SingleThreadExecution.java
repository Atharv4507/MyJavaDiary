package MyThread.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class S1_SingleThreadExecution {
    public static void main(final String[] args) {
        ExecutorService exs = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exs.execute(new Task(i));
        }
    }

    @Override
    public String toString() {
        return "S1_SingleThreadExecution []";
    }
}

class Task implements Runnable{
    private final int taskid;

    public Task(final int taskid){
        this.taskid = taskid;
    }

    @Override
    public void run() {
        System.out.println("Task with id "+ taskid+" being executed by Thread "+ Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
