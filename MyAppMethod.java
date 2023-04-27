public class MyAppMethod {

    // public static void sayHi() { // 引数がない場合のメソッド。 11行目のような記述で呼び出せる。
    // public static void sayHi(String name) { // 変数「name」はString型であり、引数として定義される。
    // 12.13行目のような記述で呼び出せる。
    public static String sayHi(String name) { // 値を返すメソッド。14.15行目のような記述で呼び出せる。よくわからん。
        // System.out.println("Hi! " + name);
        return "Hi! " + name;
    }

    public static void main(String[] args) {
        // sayHi(); // メソッド「sayHi」を呼び出す。
        // sayHi("Tom"); // メソッド「sayHi」に引数「Tom」を渡して呼び出す。
        // sayHi("Bob"); // メソッド「sayHi」に引数「Bob」を渡して呼び出す。
        String msg = sayHi("Steve");
        System.out.println(msg);
    }
}
