package Task2_Abstract_Factory.model.impl;

import Task2_Abstract_Factory.model.Interior;

public class FamilyInterior implements Interior {
    public String getMaterial() {
        return "Ткань";
    }
    public boolean hasHeatedSeats() {
        return false;
    }
}