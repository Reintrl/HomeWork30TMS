package Task6_Proxy;

public class Main {
    public static void main(String[] args) {
        // Реальные объекты еще не созданы
        System.out.println("1. СОЗДАЕМ PROXY ОБЪЕКТЫ:");
        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.png");
        Image image3 = new ImageProxy("photo3.gif");

        System.out.println("\nВсе Proxy созданы, но RealImage объекты еще не загружены!");

        checkImageState((ImageProxy) image1, "image1");
        checkImageState((ImageProxy) image2, "image2");
        checkImageState((ImageProxy) image3, "image3");

        System.out.println("Отображение image1");
        image1.display();

        checkImageState((ImageProxy) image1, "image1");
        checkImageState((ImageProxy) image2, "image2");
        checkImageState((ImageProxy) image3, "image3");

        System.out.println("Отображение image2");
        image2.display();

        checkImageState((ImageProxy) image1, "image1");
        checkImageState((ImageProxy) image2, "image2");
        checkImageState((ImageProxy) image3, "image3");

        System.out.println("Отображаем image1");
        image1.display(); // Должно работать быстро, т.к. уже загружено

        image3.display(); // Будет загружено только сейчас
    }

    private static void checkImageState(ImageProxy proxy, String name) {
        System.out.println(name + " (" + proxy.getFileName() + "): " +
                (proxy.isLoaded() ? "ЗАГРУЖЕНО" : "не загружено"));
    }
}