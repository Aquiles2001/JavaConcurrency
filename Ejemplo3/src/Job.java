<<<<<<<< HEAD:Ejemplo4/src/Job.java
package Ejemplo4.src;
========
package Ejemplo3.src;
>>>>>>>> Ejemplo3:Ejemplo3/src/Job.java

public class Job implements Runnable{
    
    private PrintQueue printQueue;

    /**
     * Constructor
     * @param printQueue
     */
    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    /**
     * Run method
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Going to print a job");
        printQueue.printJob(new Object());
        System.out.println(Thread.currentThread().getName() + ": The document has been printed");
    }
}
