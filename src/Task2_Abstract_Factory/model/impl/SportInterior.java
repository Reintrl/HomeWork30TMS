package Task2_Abstract_Factory.model.impl;

import Task2_Abstract_Factory.model.Interior;

public class SportInterior implements Interior {
    public String getMaterial() {
        return "Алькантара";
    }
    public boolean hasHeatedSeats() {
        return true;
    }
}