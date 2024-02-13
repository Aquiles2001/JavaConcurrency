package Ejemplo1;

public class Main {

    /**
     * Main method.
     * @param args Arguments.
     */
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Variable variable = new Variable();
        
        Process1 process1 = new Process1(variable);
        Process2 process2 = new Process2(variable);
        
        Thread t1 = new Thread(process1);
        Thread t2 = new Thread(process2);
        
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Bye World! variable.inCritical = " + variable.inCritical);
    }
    
}