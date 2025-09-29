package Task2_Abstract_Factory.factory.impl;

import Task2_Abstract_Factory.factory.CarFactory;
import Task2_Abstract_Factory.model.Body;
import Task2_Abstract_Factory.model.Engine;
import Task2_Abstract_Factory.model.Interior;
import Task2_Abstract_Factory.model.impl.SportBody;
import Task2_Abstract_Factory.model.impl.SportEngine;
import Task2_Abstract_Factory.model.impl.SportInterior;

public class SportCarFactory implements CarFactory {
    public Engine createEngine() {
        return new SportEngine();
    }
    public Body createBody() {
        return new SportBody();
    }
    public Interior createInterior() {
        return new SportInterior();
    }
    public String getFactoryName() {
        return "Спортивная фабрика";
    }
}
