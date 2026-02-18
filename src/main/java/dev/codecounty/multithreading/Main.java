package dev.codecounty.multithreading;

public class Main {

    public static void main(String... args) throws InterruptedException {

        System.out.println("START");

        System.out.println(Thread.currentThread());
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(500);
//            System.out.println("Hello " + i);
//        }

        Worker t1 = new Worker();
//        t1.run();
        t1.setName("t1");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        Worker t2 = new Worker();
//        t1.run();
        t2.setName("t2");
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();

        Thread t3 = new Thread(new Work2());
        t3.setName("t3");
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();

        Thread t4 = new Thread(new Work2());
        t4.setName("t4");
        t4.setPriority(2);
        t4.start();


        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("Hello " + i);
        }
        System.out.println("END");


    }
}
