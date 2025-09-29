package Task2_Abstract_Factory.model.impl;

import Task2_Abstract_Factory.model.Engine;

public class SportEngine implements Engine {
    public void start() {
        System.out.println("Рев спортивного двигателя! Врум-врум!");
    }
    public String getType() {
        return "V8 Twin-Turbo";
    }
}