package Task2_Abstract_Factory.factory.impl;

import Task2_Abstract_Factory.factory.CarFactory;
import Task2_Abstract_Factory.model.Body;
import Task2_Abstract_Factory.model.Engine;
import Task2_Abstract_Factory.model.Interior;
import Task2_Abstract_Factory.model.impl.FamilyBody;
import Task2_Abstract_Factory.model.impl.FamilyEngine;
import Task2_Abstract_Factory.model.impl.FamilyInterior;

public class FamilyCarFactory implements CarFactory {
    public Engine createEngine() {
        return new FamilyEngine();
    }
    public Body createBody() {
        return new FamilyBody();
    }
    public Interior createInterior() {
        return new FamilyInterior();
    }
    public String getFactoryName() {
        return "Семейная фабрика";
    }
}
