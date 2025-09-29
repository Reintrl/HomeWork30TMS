package Task5_Prototype;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Ryzen 5 5600", "16gb");
        Computer computerCloned = (Computer) computer.clone();

        System.out.println(computerCloned.getProcessor());
        System.out.println(computerCloned.getRam());
    }
}
