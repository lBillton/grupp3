import java.awt.*;

public class Volvo240 extends Car{


    private final static double trimFactor = 1.25;

    /**
     * instances of variables below:
     * @param color: car color.
     * @param enginePower: cars engine power.
     * @param modelName: cas model name.
     * @param nrDoors: number of car doors.
     */

    public Volvo240(Color color, double enginePower, String modelName, int nrDoors){
        super(color, enginePower, modelName, nrDoors);
    }

    /**
     * @return modifies engine power dependent on trim factor.
     */

    protected double speedFactor(){
        return enginePower * 0.01 * trimFactor;
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
