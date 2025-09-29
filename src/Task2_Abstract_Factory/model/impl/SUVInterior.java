package Task2_Abstract_Factory.model.impl;

import Task2_Abstract_Factory.model.Interior;

public class SUVInterior implements Interior {
    public String getMaterial() {
        return "Кожа";
    }
    public boolean hasHeatedSeats() {
        return true;
    }
}