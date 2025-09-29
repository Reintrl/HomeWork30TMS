package Task3_Factory_Method;

import Task3_Factory_Method.factory.CarFactory;
import Task3_Factory_Method.factory.SUVFactory;
import Task3_Factory_Method.factory.SedanFactory;
import Task3_Factory_Method.factory.SportsCarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        CarFactory suvFactory = new SUVFactory();
        CarFactory sportsFactory = new SportsCarFactory();

        sedanFactory.createCar();
        suvFactory.createCar();
        sportsFactory.createCar();

        System.out.println("Мой седан: " + sedanFactory.createCar().getInfo());
        System.out.println("Мой внедорожник: " + suvFactory.createCar().getInfo());
        System.out.println("Мой спорткар: " + sportsFactory.createCar().getInfo());
    }
}