package Task3_Factory_Method.factory;

import Task3_Factory_Method.model.Car;
import Task3_Factory_Method.model.impl.Sedan;

public class SedanFactory extends CarFactory {
    public Car createCar() {
        return new Sedan();
    }
}