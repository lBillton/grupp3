import java.awt.*;
import java.util.ArrayList;

public class Workshop <T extends Vehicle> {

    ArrayList<T> cars = new ArrayList<>();
    public Workshop(ArrayList<T> a){
        ArrayList<T> cars = a;
    }

    public void addCar(T t){
        cars.add(t);
    }

    public void removeCar(T t){
        System.out.println(t.toString());
        cars.remove(t);
    }


}
