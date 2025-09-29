package Task3_Factory_Method.model.impl;

import Task3_Factory_Method.model.Car;

public class SUV implements Car {
    public void drive() { System.out.println("Едем на внедорожнике"); }
    public String getInfo() { return "Внедорожник - мощный автомобиль для бездорожья"; }
}