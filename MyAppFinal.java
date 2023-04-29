final class User { // finalがついているとこのクラスを継承できない
    protected String name;
    private static final double VERSION = 1.1; // finalがついていると変数が変更できない（定数になる）・

    public User(String name) {
        this.name = name;
        User.VERSION = 1.2;
    }

    public final void sayHi() { // finalがついているとメソッドをオーバーライドできない。
        System.out.println("hi! " + this.name);
    }
}

class AdminUser(String name)
{

    public AdminUser(String name) {
        super(name);
    }

    @Override
    public void sayHi() {
        System.out.println("[admin] hi! " + this.name);
    }
}

public class MyAppFinal {
    public static void main(String[] args) {
        User tom = new User("tom");
    }
}
