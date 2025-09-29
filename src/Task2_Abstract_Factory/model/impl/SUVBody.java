package Task2_Abstract_Factory.model.impl;

import Task2_Abstract_Factory.model.Body;

public class SUVBody implements Body {
    public String getMaterial() {
        return "Высокопрочная сталь";
    }
    public String getColor() {
        return "Зеленый";
    }
}