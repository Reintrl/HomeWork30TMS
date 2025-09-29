package Task2_Abstract_Factory.model.impl;

import Task2_Abstract_Factory.model.Body;

public class FamilyBody implements Body {
    public String getMaterial() {
        return "Сталь";
    }
    public String getColor() {
        return "Серебристый";
    }
}