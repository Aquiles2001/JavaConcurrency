package Ejemplo2;

public class Consumer extends Thread{

    private Buffer buffer;

    /**
     * Constructor
     * @param buffer
     */
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    
    /**
     * Run method
     */
    @Override
    public void run() {
        char value;
        for (int i = 0; i < 30; i++) {
            value = buffer.get();
            System.out.println("Consumer got: " + value);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}
