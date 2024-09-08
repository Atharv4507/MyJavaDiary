package MyThread.ConcurrentCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class syncronizedCollection{
    public static void main(String[] args) throws InterruptedException{
        // List<Integer> list = new ArrayList<>(); // It not work although we use join()
        //so,
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Thread one = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                list.add(i);
            }
        });

        Thread two = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                list.add(i);
            }
        });
        
        

        one.start();
        two.start();
        one.join();
        two.join();

        System.out.println(list.size());
    }
}

