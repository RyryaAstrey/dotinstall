class User {
    String name;

    User(String name) {
        this.name = name;
    }

    User() {
        this.name = "Me!";
    }

    void sayHi() {
        System.out.println("hi! " + this.name);
    }
}

public class MyAppConstructor {
    public static void main(String[] args) {
        User tom;
        tom = new User(); // インスタンス
        System.out.println(tom.name);
        tom.sayHi();
    }
}
