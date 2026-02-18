package dev.codecounty.multithreading;

import java.util.concurrent.CompletableFuture;

public class RunAsyncExample {
    public static void main(String[] args) {

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Task running in: " + Thread.currentThread().getName());
        });

        // Wait for task to finish
        future.join();

        System.out.println("Main thread finished");
    }
}
