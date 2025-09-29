package Task3_Factory_Method.model.impl;

import Task3_Factory_Method.model.Car;

public class Sedan implements Car {
    public void drive() { System.out.println("Едем на седане"); }
    public String getInfo() { return "Седан - комфортный городской автомобиль"; }
}