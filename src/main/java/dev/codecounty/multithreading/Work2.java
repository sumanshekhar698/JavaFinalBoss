package dev.codecounty.multithreading;

public class Work2 implements Runnable {
    @Override
    public void run() {//Work

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Hello " + i + " from " + Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
