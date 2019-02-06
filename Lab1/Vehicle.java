import java.awt.*;

public class Vehicle {
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double horizontal = 0;
    protected double vertical = 0;
    protected int currentDirection = 0;

    public Vehicle(Color color, double enginePower, String modelName, int nrDoors){
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.nrDoors = nrDoors;
        stopEngine();
    }
    /**
     * @return returns the number of doors.
     */

    protected int getNrDoors(){
        return nrDoors;
    }

    /**
     * @return returns the power of the engine.
     */

    protected double getEnginePower(){
        return enginePower;
    }

    /**
     * @return returns the current speed.
     */

    protected double getCurrentSpeed(){
        return currentSpeed;
    }

    /**
     * @return returns the color of the car.
     */

    protected Color getColor(){
        return color;
    }

    /**
     * @param clr: sets the color.
     */

    protected void setColor(Color clr){
        color = clr;
    }

    /**
     * startEngine: starts the car.
     */

    protected void startEngine(){
        currentSpeed = 0.1;
    }

    /**
     * stopEngine: stop the car.
     */

    protected void stopEngine(){
        currentSpeed = 0;
    }

    /**
     * move: Overrides the method in Movable. Changes the coordinates based on the current direction.
     */

    //@Override
    public void move(){

        if (currentDirection == 0){
            vertical = vertical + currentSpeed; //North
        }
        if (currentDirection == 1) {
            horizontal = horizontal + currentSpeed; //East
        }
        if (currentDirection == 2) {
            vertical = vertical - currentSpeed; //South
        }
        if (currentDirection == 3){
            horizontal = horizontal - currentSpeed; //West
        }

    }

    /**
     * turnLeft: turns left based on current direction.
     */

    //@Override
    public void turnLeft(){
        if(currentDirection == 0){
            currentDirection = 3;
        }
        else{
            currentDirection = currentDirection - 1;
        }
    }

    /**
     * turnRight: turns right based on current direction.
     */
    public void incrementSpeed(double amount){

    }

    public void decrementSpeed(double amount){

    }

    //@Override
    public void turnRight(){
        if(currentDirection == 3){
            currentDirection = 0;
        }
        else{
            currentDirection = currentDirection + 1;
        }
    }

    public void gas(double amount){
        if(amount <= 1 && amount >= 0){
            incrementSpeed(amount);
        }
    }

    public void brake(double amount){
        if(amount <= 1 && amount >= 0){
            decrementSpeed(amount);
        }
    }


}


