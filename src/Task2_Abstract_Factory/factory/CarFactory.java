package Task2_Abstract_Factory.factory;

import Task2_Abstract_Factory.model.Body;
import Task2_Abstract_Factory.model.Engine;
import Task2_Abstract_Factory.model.Interior;

public interface CarFactory {
    Engine createEngine();
    Body createBody();
    Interior createInterior();
    String getFactoryName();
}