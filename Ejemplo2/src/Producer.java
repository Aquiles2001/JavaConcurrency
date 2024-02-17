package Ejemplo2.src;

public class Producer extends Thread{

    private Buffer buffer;
    private final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    /**
     * Constructor
     * @param buffer
     */
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    /**
     * Run method
     */
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            char value = alphabet.charAt((int) (Math.random() * alphabet.length()));
            buffer.put(value);
            System.out.println("Producer put: " + value);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
}
