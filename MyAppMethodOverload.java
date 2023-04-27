public class MyAppMethodOverload {
    public static void sayHi(String name) {
        // int x = 10; // この変数xはメソッド内でのみ有効。他のメソッドでは使えない。
        System.out.println("Hi! " + name);
    }

    public static void sayHi() {
        // int x = 10;
        System.out.println("Hi! Nobody!");
    }

    public static void main(String[] args) {
        sayHi();
        sayHi("Steve");

    }
}
