package dev.codecounty.multithreading;

public class VisibilityProblem {



    // volatile keyword is used to make sure that the value of the variable is
    // always read from the main memory and not from the thread's local cache
    volatile static boolean flag = true;
    // if you mark a variable as volatile,
    // it means that any thread that reads the variable will see the most recent value written to it by any other thread.
    // This is because the volatile keyword ensures that all threads see the same value of the variable
    // , and that any changes made to the variable by one thread are immediately visible to all other threads.


    public static void main(String... args) {

        Thread t1 = new Thread(() -> {
            while (flag) {
                System.out.println("Stop me if you can!!");
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            flag = false;
        });

        t2.start();

    }
}
