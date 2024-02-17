package Ejemplo2.src;

public class Buffer {
    
    private char content;
    private boolean available = false;

    /**
     * Get the value of content
     * @return the value of content
     */
    public synchronized char get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        available = false;
        notifyAll();
        return content;
    }

    /**
     * Set the value of content
     * @param value new value of content
     */
    public synchronized void put(char value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        content = value;
        available = true;
        notifyAll();
    }
}
