class User {
    private String name;
    private static int count = 0;

    static {
        User.count = 0;
        System.out.println("Static initializer");
    }

    {
        System.out.println("Instance initializer");
    }

    public User(String name) {
        this.name = name;
        User.count++;
        System.out.println("Constructor");
    }

    public static void getInfo() {
        System.out.println("# of instances: " + User.count);
    }
}

public class MyAppInitializer {
    public static void main(String[] args) {
        User.getInfo();
        User tom = new User("tom");
        User.getInfo();
        User bob = new User("bob");
        User.getInfo();
    }
}