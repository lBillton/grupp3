import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertTrue;


public class TestVehicle{



    @Test
    public void getNrDoors(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        assertTrue(sophia96.nrDoors == sophia96.getNrDoors());
    }

    @Test
    public void getEnginePower(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        assertTrue(sophia96.enginePower == sophia96.getEnginePower());
    }

    @Test
    public void getCurrentSpeed(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        assertTrue(sophia96.currentSpeed == sophia96.getCurrentSpeed());
    }

    @Test
     public void getColor(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        assertTrue(sophia96.getColor() == Color.BLACK);
    }
   

    @Test
    public void setColor(){
    Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
    sophia96.setColor(Color.RED);
    assertTrue(Color.BLACK != sophia96.getColor());
    }
    @Test
    public void startEngine(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        double a = 0.1;
        sophia96.startEngine();
        assertTrue(a == sophia96.currentSpeed);
    }
    @Test
    public void stopEngine(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        int currentSpeed = 0;
        sophia96.stopEngine();
        assertTrue(currentSpeed == sophia96.currentSpeed);
    }

    @Test
    public void moveNorth() {
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4);
        sophia96.startEngine();
        sophia96.move();
        assertTrue(sophia96.vertical != 0);
        }

    @Test
    public void moveEast() {
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4);
        sophia96.currentDirection = 1;
        sophia96.startEngine();
        sophia96.move();
        assertTrue(sophia96.horizontal != 0);
    }

    @Test
    public void moveSouth() {
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4);
        sophia96.currentDirection = 2;
        sophia96.startEngine();
        sophia96.move();
        assertTrue(sophia96.vertical != 0);
    }

    @Test
    public void moveWest() {
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4);
        sophia96.currentDirection = 3;
        sophia96.startEngine();
        sophia96.move();
        assertTrue(sophia96.horizontal != 0);
    }




    @Test
    public void turnLeftReset(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        sophia96.currentDirection = 0;
        sophia96.turnLeft();
        assertTrue(3 == sophia96.currentDirection);
    }

    @Test
    public void turnLeftDecrement(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        sophia96.currentDirection = 2;
        int current = 2;
        sophia96.turnLeft();
        assertTrue(current - 1 == sophia96.currentDirection);
    }

    @Test
    public void turnRightIncrement(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        int current = sophia96.currentDirection;
        sophia96.turnRight();
        assertTrue(current+1 == sophia96.currentDirection);
    }

    @Test
    public void turnRightReset(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        sophia96.currentDirection = 3;
        sophia96.turnRight();
        assertTrue(0 == sophia96.currentDirection);
    }

    @Test
    public void gas(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        double curr = sophia96.getCurrentSpeed();
        sophia96.startEngine();
        sophia96.gas(0.5);
        assertTrue(curr < sophia96.currentSpeed);
    }

    @Test
    public void brake(){
        Vehicle sophia96 = new Vehicle(Color.BLACK, 100, "Sophia96", 4 );
        startEngine();
        sophia96.brake(1);
        assertTrue(0 == sophia96.currentSpeed);
    }

}
