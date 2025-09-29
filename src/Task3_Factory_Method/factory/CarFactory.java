package Task3_Factory_Method.factory;

import Task3_Factory_Method.model.Car;

public abstract class CarFactory {
    public abstract Car createCar();

    public void deliverCar() {
        Car car = createCar();
        System.out.println("Доставляем автомобиль: " + car.getInfo());
        car.drive();
    }
}