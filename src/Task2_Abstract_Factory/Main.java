package Task2_Abstract_Factory;

import Task2_Abstract_Factory.factory.CarFactory;
import Task2_Abstract_Factory.factory.impl.FamilyCarFactory;
import Task2_Abstract_Factory.factory.impl.SUVCarFactory;
import Task2_Abstract_Factory.factory.impl.SportCarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory;
        String type = "suv";

        switch (type.toLowerCase()) {
            case "sport" -> factory = new SportCarFactory();
            case "family" -> factory = new FamilyCarFactory();
            case "suv" -> factory = new SUVCarFactory();
            default ->
                throw new IllegalArgumentException("Неизвестный тип автомобиля: " + type);
        }

        System.out.println("Устанавливаем " + factory.createEngine().getType() + " двигатель");
        System.out.println("Кузов: " + factory.createBody().getMaterial()
                + ", цвет: " + factory.createBody().getColor());
        System.out.println("Салон: " + factory.createInterior().getMaterial());
    }
}
