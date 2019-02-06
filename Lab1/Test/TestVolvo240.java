import org.junit.Test;

import java.awt.*;
import static org.junit.Assert.assertTrue;

public class TestVolvo240 {

    private final static double trimFactor = 1.25;

    @Test
    public void speedFactor(){
        Car volvo = new Volvo240(Color.BLACK, 100, "Saab95", 4);
        volvo.startEngine();
        assertTrue(volvo.enginePower * 0.01 * trimFactor > 0);
    }

    @Test
    public void incrementSpeed(){
        Volvo240 volvo240 = new Volvo240(Color.BLACK, 100, "Volvo240", 4);
        volvo240.startEngine();
        volvo240.incrementSpeed(1);
        assertTrue(volvo240.currentSpeed > 0);
    }



    @Test
    public void decrementSpeed(){
        Volvo240 volvo240 = new Volvo240(Color.BLACK, 100, "Volvo240", 4);
        volvo240.startEngine();
        volvo240.decrementSpeed(1);
        assertTrue(volvo240.currentSpeed == 0);
    }

}


