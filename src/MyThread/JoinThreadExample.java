package MyThread;

public class JoinThreadExample{
    public static void main(String[] args) throws InterruptedException{
        
        Thread one = new Thread(()-> {
            for(int i=0;i<5;i++){
                System.out.println("Thread one: "+i);
            }
        });

        Thread two = new Thread(()->{
            for(int i=0;i<15;i++){
                System.out.println("Thread twome: "+i);
            }
        });

        System.out.println("Before Execution the Thread");
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("Done Execution the thread!");
    }
}
