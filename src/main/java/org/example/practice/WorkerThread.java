package org.example.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.*;

public class WorkerThread {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++) {
            final int t = i;
            executorService.execute(() -> {
                try {
                    System.out.println("Thread i - start "+t);
                    sleep(50);
                    System.out.println("Thread i - end "+t);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
        while(executorService.isTerminated()) {}
        System.out.println("Finished all threads");
    }
}
