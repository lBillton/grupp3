import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertTrue;

public class TestCarTransport {

    @Test
    public void proxToCarTransport() {
        Saab95 sophia96 = new Saab95(Color.BLACK, 100, "Sophia96", 4);
        CarTransport sophia961 = new CarTransport(Color.BLACK, 100, "Sophia96", 4);
        assertTrue(sophia961.proxToCarTransport(sophia96));
    }

    @Test
    public void loadOnCarTransport() {
        Saab95 sophia96 = new Saab95(Color.BLACK, 100, "Sophia96", 4);
        CarTransport sophia961 = new CarTransport(Color.BLACK, 100, "Sophia96", 4);
        sophia961.tilt = true;
        sophia961.loadOnCarTransport(sophia96);
        assertTrue(!(sophia961.carLoad.isEmpty()));
        //INTE FÄRDIG
    }

    @Test
    public void releaseCarFromTransport(){
        Saab95 sophia96 = new Saab95(Color.BLACK, 100, "Sophia96", 4);
        CarTransport sophia961 = new CarTransport(Color.BLACK, 100, "Sophia96", 4);
        sophia961.tilt = true;
        sophia961.loadOnCarTransport(sophia96);
        sophia961.releaseCarFromTransport(sophia96);
        assertTrue(sophia961.carLoad.isEmpty());
    }

    @Test
    public void moveNorth() {
        CarTransport sophia96 = new CarTransport(Color.BLACK, 100, "Sophia96", 4);
        Saab95 sophia961 = new Saab95(Color.BLACK, 100, "Sophia96", 4);
        sophia96.tilt = true;
        sophia96.loadOnCarTransport(sophia961);
        sophia96.startEngine();
        sophia96.tilt = false;
        sophia96.move();
        assertTrue(sophia96.vertical != 0);
    }

    @Test
    public void moveEast() {
        CarTransport sophia96 = new CarTransport(Color.BLACK, 100, "Sophia96", 4);
        Saab95 sophia961 = new Saab95(Color.BLACK, 100, "Sophia96", 4);
        sophia96.tilt = true;
        sophia96.loadOnCarTransport(sophia961);
        sophia96.currentDirection = 1;
        sophia96.startEngine();
        sophia96.tilt = false;
        sophia96.move();
        assertTrue(sophia96.horizontal != 0);
    }

    @Test
    public void moveSouth() {
        CarTransport sophia96 = new CarTransport(Color.BLACK, 100, "Sophia96", 4);
        Saab95 sophia961 = new Saab95(Color.BLACK, 100, "Sophia96", 4);
        sophia96.tilt = true;
        sophia96.loadOnCarTransport(sophia961);
        sophia96.currentDirection = 2;
        sophia96.startEngine();
        sophia96.tilt = false;
        sophia96.move();
        assertTrue(sophia96.vertical != 0);
    }

    @Test
    public void moveWest() {
        CarTransport sophia96 = new CarTransport(Color.BLACK, 100, "Sophia96", 4);
        Saab95 sophia961 = new Saab95(Color.BLACK, 100, "Sophia96", 4);
        sophia96.tilt = true;
        sophia96.loadOnCarTransport(sophia961);
        sophia96.currentDirection = 3;
        sophia96.startEngine();
        sophia96.tilt = false;
        sophia96.move();
        assertTrue(sophia96.horizontal != 0);
    }
}
