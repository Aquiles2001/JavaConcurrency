package Ejemplo1.src;

public class Process1 implements Runnable {

    private Variable variable;

    /**
     * Constructor.
     * @param variable Variable.
     */
    public Process1(Variable variable) {
        this.variable = variable;
    }

    /**
     * Run method.
     */
    @Override
    public void run() {
        while(variable.inCritical == 0) {
            variable.y1 = variable.y2 + 1;

            while(!(variable.y2 == 0 || variable.y1 < variable.y2)) {
                // wait
            }

            variable.inCritical ++;

            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
 
            variable.inCritical --;
            variable.y1 = 0;

            //System.out.println("Process 1 - in critical " + variable.inCritical);
        }

        return;
    }
    
}
