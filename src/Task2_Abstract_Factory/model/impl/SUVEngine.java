package Task2_Abstract_Factory.model.impl;

import Task2_Abstract_Factory.model.Engine;

public class SUVEngine implements Engine {
    public void start() {
        System.out.println("Мощный запуск дизельного двигателя");
    }
    public String getType() {
        return "Дизель 3.0L";
    }
}