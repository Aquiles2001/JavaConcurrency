<<<<<<<< HEAD:Ejemplo4/src/Main.java
package Ejemplo4.src;
========
package Ejemplo3.src;
>>>>>>>> Ejemplo3:Ejemplo3/src/Main.java

public class Main {
    
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Job(printQueue), "Thread " + i);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        try {
            for (int i = 0; i < 10; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main: The document has been printed");
    }
}
