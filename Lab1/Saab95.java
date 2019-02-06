import java.awt.*;

public class Saab95 extends Car{

    protected boolean turboOn;
    /**
     * Constructor Saab95; instances of variables below.
     * @param color: car color.
     * @param enginePower: engine power.
     * @param modelName: model name.
     * @param nrDoors: number  of car doors.
     */
    public Saab95(Color color, double enginePower, String modelName, int nrDoors){
        super(color, enginePower, modelName, nrDoors);
        turboOn = false;
    }

    /**
     * setTurboOn: turns turbo on.
     */

    public void setTurboOn(){
	    turboOn = true;
    }

    /**
     * setTurboOff: turn off turbo.
     */

    public void setTurboOff(){
	    turboOn = false;
    }

    /**
     * checks if turbo power is on; if yes, accelerates.
     * @return returns modified engine power.
     */
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    /**
     * @param amount: increases speed based partly on engine power
     */


    public void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    /**
     * @param amount: decreases speed based partly on engine power
     */

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

}
