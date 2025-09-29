package Task3_Factory_Method.model.impl;

import Task3_Factory_Method.model.Car;

public class SportsCar implements Car {
    public void drive() { System.out.println("Едем на спортивной машине!"); }
    public String getInfo() { return "Спортивный автомобиль - высокая скорость и динамика"; }
}
