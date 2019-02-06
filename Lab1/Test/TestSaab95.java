import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TestSaab95 {

    @Test
    public void setTurboOn(){
        Saab95 saab = new Saab95(Color.BLACK, 100, "Saab95", 4);
        ((Saab95) saab).setTurboOn();
        assertTrue(((Saab95) saab).turboOn == true);
    }


    @Test
    public void setTurboOff(){
        Saab95 saab = new Saab95(Color.BLACK, 100, "Saab95", 4);
        ((Saab95) saab).setTurboOff();
        assertTrue(((Saab95) saab).turboOn == false);
    }

    @Test
    public void speedFactorOff(){
        Saab95 saab = new Saab95(Color.BLACK, 100, "Saab95", 4);
        double turbo = 1;
        if(saab.turboOn) turbo = 1.3;
        double speedChangeFactor = saab.enginePower * 0.01 * turbo;
        assertTrue(speedChangeFactor > 0);
    }

    @Test
    public void speedFactorOn(){
        Saab95 saab = new Saab95(Color.BLACK, 100, "Saab95", 4);
        saab.turboOn = true;
        double turbo = 1;
        if(saab.turboOn) turbo = 1.3;
        double speedChangeFactor = saab.enginePower * 0.01 * turbo;
        assertTrue(speedChangeFactor > 0);
    }

    @Test
    public void incrementSpeed(){
        Saab95 saab = new Saab95(Color.BLACK, 100, "Saab95", 4);
        saab.startEngine();
        saab.incrementSpeed(1);
        assertTrue(saab.currentSpeed > 0);
    }



    @Test
    public void decrementSpeed(){
        Saab95 saab = new Saab95(Color.BLACK, 100, "Saab95", 4);
        saab.startEngine();
        saab.decrementSpeed(1);
        assertTrue(saab.currentSpeed == 0);
    }

}



