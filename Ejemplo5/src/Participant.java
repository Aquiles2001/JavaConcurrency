package Ejemplo5.src;

import java.util.concurrent.TimeUnit;

public class Participant implements Runnable{

    private Videoconference conference;
    private String name;

    /*
     * Constructor of the class
     * @param conference The videoconference in which the participant will
     * participate
     * @param name The name of the participant
     */
    public Participant(Videoconference conference, String name) {
        this.conference = conference;
        this.name = name;
    }

    /*
     * Core method of the participant. It arrives to the videoconference
     */
    @Override
    public void run() {
        long duration = (long) (Math.random() * 10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        conference.arrive(name);
    }
}
