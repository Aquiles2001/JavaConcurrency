package Ejemplo1;

public class Process2 implements Runnable {

    private Variable variable;

    /**
     * Constructor.
     * @param variable Variable.
     */
    public Process2(Variable variable) {
        this.variable = variable;
    }

    /**
     * Run method.
     */
    @Override
    public void run() {
        while(variable.inCritical == 0) {
            variable.y2 = variable.y1 + 1;

            while(!(variable.y1 == 0 || variable.y2 < variable.y1)) {
                // wait
            }

            variable.inCritical ++;

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            variable.inCritical --;
            variable.y2 = 0;

            //System.out.println("Process 2 - in critical " + variable.inCritical);
        }

        return;
    }
    
}