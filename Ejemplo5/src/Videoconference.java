package Ejemplo5.src;

import java.util.concurrent.CountDownLatch;

public class Videoconference implements Runnable{

    /*
     * This class uses a CountDownLatch to control the arrival of all the
     */
    private final CountDownLatch controller;

    /*
     * Constructor of the class. Initializes the CountDownLatch
     * @param number The number of participants in the videoconference
     */
    public Videoconference(int number) {
        controller = new CountDownLatch(number);
    }

    /*
     * This method is called by each participant when he incorporates to the
     * VideoConference
     * @param name The name of the participant that incorporates to the
     */
    public void arrive(String name) {
        System.out.printf("%s has arrived.", name);
        controller.countDown();
        System.out.printf("Videoconference: Waiting for %d participants.\n", controller.getCount());
    }

    /*
     * Core method of the videoconference. It waits for all the participants
     * to arrive
     */
    @Override
    public void run() {
        System.out.printf("Videoconference: Initialization: %d participants.\n", controller.getCount());
        
        try {
            controller.await();
            System.out.printf("Videoconference: All the participants have come\n");
            System.out.printf("Videoconference: Let's start...\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}