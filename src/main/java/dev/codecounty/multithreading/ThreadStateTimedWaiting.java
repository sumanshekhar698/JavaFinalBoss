package dev.codecounty.multithreading;

public class ThreadStateTimedWaiting {


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
        System.out.println(t1.getState());//RUNNABLE


        Thread.sleep(2000);
        System.out.println(t1.getState());//TIMED WAITING
        Thread.sleep(2000);

        System.out.println("END " + Thread.currentThread());
    }
}
