package Task6_Proxy;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // Тяжелая операция при создании
    }

    private void loadFromDisk() {
        System.out.println("Загрузка " + fileName + " с диска... (это может занять время)");
        // Имитация тяжелой операции
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void display() {
        System.out.println("Отображение изображения: " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}