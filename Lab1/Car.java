import java.awt.*;

public class Car extends Vehicle implements Movable{
/*
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    protected double horizontal = 0;
    protected double vertical = 0;
    protected int currentDirection = 0;

    /**
     * Car: A constructor which instances variables (color, enginePower, modelName, nrDoors).
     * @param color: The color of the car.
     * @param enginePower: The power of the engine.
     * @param modelName: The name of the model.
     * @param nrDoors: The number of doors.
     */


    public Car(Color color, double enginePower, String modelName, int nrDoors){
        super(color, enginePower, modelName, nrDoors);
        stopEngine();
    }
}

