package Task1_Singleton;

public class Main {
    public static void main(String[] args) {
        Admin admin1 = Admin.getInstance();
        Admin admin2 = Admin.getInstance();

        System.out.println(admin1);
        System.out.println(admin2);
    }
}