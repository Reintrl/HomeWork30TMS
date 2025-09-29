package Task2_Abstract_Factory.model.impl;

import Task2_Abstract_Factory.model.Body;

public class SportBody implements Body {
    public String getMaterial() {
        return "Углепластик";
    }
    public String getColor() {
        return "Красный";
    }
}