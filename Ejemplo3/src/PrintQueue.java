package Ejemplo3.src;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class PrintQueue {
    
    private final Semaphore semaphore;

    /**
     * Constructor
     */
    public PrintQueue() {
        semaphore = new Semaphore(1);
    }

    /**
     * Method to print a document
     * @param document
     */
    public void printJob(Object document) {
        try {
            semaphore.acquire();
            long duration = (long) (Math.random() * 10);
            System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a Job during " + duration + " seconds");
            Thread.sleep(duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

