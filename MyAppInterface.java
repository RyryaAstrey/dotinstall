interface Printable {
    // 定数
    double VERSION = 1.2; // finalは省略できる
    // 抽象メソッド

    void print();

    // defaultメソッド
    public default void getInfo() {
        System.out.println("I/F ver. " + Printable.VERSION);
    }
    // staticメソッド
    // 以上の４つが書ける
}

class User implements Printable {
    @Override
    public void print() {
        System.out.println("Now printing user profile...");
    }
}

public class MyAppInterface {
    public static void main(String[] args) {
        User tom = new User();
        tom.print();
        tom.getInfo();
    }
}
