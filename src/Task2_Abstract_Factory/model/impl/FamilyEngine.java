package Task2_Abstract_Factory.model.impl;

import Task2_Abstract_Factory.model.Engine;

public class FamilyEngine implements Engine {
    public void start() {
        System.out.println("Тихий запуск семейного двигателя");
    }

    public String getType() {
        return "ECO 1.6L";
    }
}