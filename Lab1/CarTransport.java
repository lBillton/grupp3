import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class CarTransport extends Vehicle {

    boolean tilt;
    Stack<Car> carLoad = new Stack<>();

    public CarTransport(Color color, double enginePower, String modelName, int nrDoors) {
        super(color, enginePower, modelName, nrDoors);
        this.tilt = false;
    }

    @Override
    public void move() {
        if (!tilt) {
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
            if(!carLoad.isEmpty()){
                for(Car car: carLoad){
                    car.horizontal = horizontal;
                    car.vertical = vertical;
                }
            }
        }
    }

    public boolean proxToCarTransport(Car car) {
        double c = car.horizontal;
        double x = horizontal;
        double min = Math.min(c, x);
        double max = Math.max(c, x);
        return (max - min <= 10);
    }

    public void loadOnCarTransport(Car car) {
        if (tilt && currentSpeed == 0 && proxToCarTransport(car)) {
            carLoad.add(car);
        }
    }

    public void releaseCarFromTransport(Car car){
        if (tilt && currentSpeed == 0 && !carLoad.isEmpty()) {
            carLoad.pop();
        }
    }

}