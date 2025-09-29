package Task2_Abstract_Factory.factory.impl;

import Task2_Abstract_Factory.factory.CarFactory;
import Task2_Abstract_Factory.model.Body;
import Task2_Abstract_Factory.model.Engine;
import Task2_Abstract_Factory.model.Interior;
import Task2_Abstract_Factory.model.impl.SUVBody;
import Task2_Abstract_Factory.model.impl.SUVEngine;
import Task2_Abstract_Factory.model.impl.SUVInterior;

public class SUVCarFactory implements CarFactory {
    public Engine createEngine() {
        return new SUVEngine();
    }
    public Body createBody() {
        return new SUVBody();
    }
    public Interior createInterior() {
        return new SUVInterior();
    }
    public String getFactoryName() {
        return "Фабрика внедорожников";
    }
}