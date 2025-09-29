package Task4_Buider;

public class Computer {
    private String processor;
    private String ram;

    private String storage;
    private String graphicsCard;
    private String motherboard;
    private boolean isBluetoothEnabled;
    private boolean isWifiEnabled;

    public static class ComputerBuilder {
        private final Computer computer;

        public ComputerBuilder(String processor, String ram) {
            computer = new Computer();
            computer.processor = processor;
            computer.ram = ram;
        }

        public ComputerBuilder setStorage(String storage) {
            computer.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            computer.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setMotherboard(String motherboard) {
            computer.motherboard = motherboard;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            computer.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public ComputerBuilder setWifiEnabled(boolean isWifiEnabled) {
            computer.isWifiEnabled = isWifiEnabled;
            return this;
        }

        public Computer build() {
            validate();
            return computer;
        }

        private void validate() {
            if (computer.processor == null || computer.processor.trim().isEmpty()) {
                throw new IllegalArgumentException("Processor is required");
            }
            if (computer.ram == null || computer.ram.trim().isEmpty()) {
                throw new IllegalArgumentException("RAM is required");
            }
        }
    }
    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", bluetooth=" + isBluetoothEnabled +
                ", wifi=" + isWifiEnabled +
                '}';
    }
}
