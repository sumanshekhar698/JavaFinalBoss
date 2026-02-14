package dev.codecounty.multithreading;

public class ThreadJoinAndSimpleThreadStates {


    public static void main(String... args) throws InterruptedException {


        System.out.println("START " + Thread.currentThread());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello " + i + " from " + Thread.currentThread());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(t1.getState());//NEW
        t1.start();
//        Worker t2 = new Worker();
//        t2.start();
//        t2.join();
        System.out.println(t1.getState());//RUNNABLE
        t1.join();


        System.out.println(t1.getState());//TERMINATED
//        System.out.println(t2.getState());

        System.out.println("END " + Thread.currentThread());
    }
}
