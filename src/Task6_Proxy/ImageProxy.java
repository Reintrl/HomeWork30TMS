package Task6_Proxy;

public class ImageProxy implements Image {
    private final String fileName;
    private RealImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
        System.out.println("Proxy создан для: " + fileName + " (реальное изображение еще не загружено)");
    }

    @Override
    public void display() {
        // Ленивая загрузка - создаем RealImage только при первом вызове
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    public boolean isLoaded() {
        return realImage != null;
    }
}