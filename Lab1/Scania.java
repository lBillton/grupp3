import java.awt.*;

public class Scania extends Vehicle{

    protected int tiltAngle;

    public Scania(Color color, double enginePower, String modelName, int nrDoors){
        super(color, enginePower, modelName, nrDoors);
        this.tiltAngle = 0;
    }

    public void tiltUp(int amount){
        if(amount + tiltAngle <= 70 && amount >=0 && currentSpeed == 0) {
            tiltAngle = Math.min(tiltAngle + amount,70);
        }
    }

    public void tiltDown(int amount){
        if(amount >= 0 && tiltAngle - amount >= 0 && currentSpeed == 0) {
            tiltAngle = Math.max(tiltAngle - amount,0);
        }
    }

    @Override
    public void move(){
        if(tiltAngle == 0) {

            if (currentDirection == 0) {
                vertical = vertical + currentSpeed; //North
            }
            if (currentDirection == 1) {
                horizontal = horizontal + currentSpeed; //East
            }
            if (currentDirection == 2) {
                vertical = vertical - currentSpeed; //South
            }
            if (currentDirection == 3) {
                horizontal = horizontal - currentSpeed; //West
            }
        }
    }



}
