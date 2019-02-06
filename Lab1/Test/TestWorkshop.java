import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class TestWorkshop {
    @Test
    public void addCar(){
        ArrayList<Car> a = new ArrayList<>();
        Workshop<Car>  workshop = new Workshop<>(a);
        Saab95 sophia96 = new Saab95(Color.BLACK, 100, "Sophia96", 4);
        workshop.addCar(sophia96);
        assertTrue(!workshop.cars.isEmpty());
    }
    @Test
    public void removeCar(){
        ArrayList<Car> a = new ArrayList<>();
        Workshop<Car>  workshop = new Workshop<>(a);
        Saab95 sophia96 = new Saab95(Color.BLACK, 100, "Sophia96", 4);
        workshop.addCar(sophia96);
        workshop.removeCar(sophia96);
        assertTrue(workshop.cars.isEmpty());
    }
}
