package Ejemplo2;

public class Main {
    
    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
