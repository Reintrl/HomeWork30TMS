package Task5_Prototype;

public class Computer implements Prototype {
    private String processor;
    private String ram;

    public Computer(String processor, String ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public Prototype clone() {
        return new Computer(processor, ram);
    }
}
