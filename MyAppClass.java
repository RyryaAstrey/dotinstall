class User {
    String name = "Me!"; // クラスに属する変数を「フィールド」という

    void sayHi() {
        System.out.println("hi!");
    }
}

public class MyAppClass {
    public static void main(String[] args) {
        User tom;
        tom = new User(); // インスタンス
        System.out.println(tom.name);
        tom.sayHi();
    }
}
