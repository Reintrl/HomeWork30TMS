package Task1_Singleton;

public class Admin {
    private static Admin instance;
    private String username;

    private Admin() {
        this.username = "System Administrator";
    }

    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }
}