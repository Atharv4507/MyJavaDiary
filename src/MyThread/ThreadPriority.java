package MyThread;

public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " says hi!");
        System.out.println(Thread.currentThread().getPriority());/* 5 */
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);/* 10 */
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);/* 5 */
        System.out.println(Thread.currentThread().getPriority());

        Thread one = new Thread(() -> {
            System.out.println("Thread one says hi!");

        });
        one.setPriority(Thread.MAX_PRIORITY);
        one.start();
        
        /*1. Although Thread One has higher priority than Main Thread still cpu executes main Thread first */
        /*2. MIN_PRIORITY:- 1, MAX_PRIORITY:- 10, NORM_PRIORITY:- 5 */
        /*3. Default Priority is 5 */
        


    }
}
