package Task3_Factory_Method.factory;

import Task3_Factory_Method.model.Car;
import Task3_Factory_Method.model.impl.SportsCar;

public class SportsCarFactory extends CarFactory {
    public Car createCar() {
        return new SportsCar();
    }
}