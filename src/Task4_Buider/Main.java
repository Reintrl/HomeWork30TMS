package Task4_Buider;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("Intel", "24gb")
                .setStorage("4TB NVMe SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setWifiEnabled(true).build();

        System.out.println(computer);
    }
}
