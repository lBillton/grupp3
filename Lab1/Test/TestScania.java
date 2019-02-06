import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertTrue;

public class TestScania {

    @Test
    public void tiltUp(){
        Scania sophia96 = new Scania(Color.BLACK, 100, "Sophia96", 4);
        sophia96.tiltUp(30);
        assertTrue(sophia96.tiltAngle != 0);
    }

    @Test
    public void tiltDown(){
        Scania sophia96 = new Scania(Color.BLACK, 100, "Sophia96", 4);
        sophia96.tiltUp(30);
        sophia96.tiltDown(30);
        assertTrue(sophia96.tiltAngle <= 70);
    }

    @Test
    public void moveNorth() {
        Scania sophia96 = new Scania(Color.BLACK, 100, "Sophia96", 4);
        sophia96.startEngine();
        sophia96.move();
        assertTrue(sophia96.vertical != 0);
    }

    @Test
    public void moveEast() {
        Scania sophia96 = new Scania(Color.BLACK, 100, "Sophia96", 4);
        sophia96.currentDirection = 1;
        sophia96.startEngine();
        sophia96.move();
        assertTrue(sophia96.horizontal != 0);
    }

    @Test
    public void moveSouth() {
        Scania sophia96 = new Scania(Color.BLACK, 100, "Sophia96", 4);
        sophia96.currentDirection = 2;
        sophia96.startEngine();
        sophia96.move();
        assertTrue(sophia96.vertical != 0);
    }

    @Test
    public void moveWest() {
        Scania sophia96 = new Scania(Color.BLACK, 100, "Sophia96", 4);
        sophia96.currentDirection = 3;
        sophia96.startEngine();
        sophia96.move();
        assertTrue(sophia96.horizontal != 0);
    }
}
