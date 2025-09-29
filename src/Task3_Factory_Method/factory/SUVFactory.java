package Task3_Factory_Method.factory;

import Task3_Factory_Method.model.Car;
import Task3_Factory_Method.model.impl.SUV;

public class SUVFactory extends CarFactory {
    public Car createCar() {
        return new SUV();
    }
}