public class MyApp2 {
    /*
     * comment
     */
    public static void main(String[] args) {
        // 文字
        char a = 'a';
        // 整数 byte short int long
        // int x = 10;
        long y = 5555555555L; // longを使う場合は数値の最後に「L（小文字でも可。１と間違えやすいので大文字を推奨）」をつける必要がある
        // 浮動小数点数 float double
        double d = 222222.44444; // 基本的により大きな数字を扱えるdoubleを使うと良い
        float f = 33.55F; // floatを使う場合は数値の最後に「F（小文字でも可）」をつける必要がある
        // 論理値
        boolean flag = true; // falseになることもある
        // 文字列
        // \nで改行できる
        // \tでtabになる
        String msg = "Hello Wo\nrld Again\t!";
        System.out.println(msg);

        // 演算
        // int i;
        // i = 10 / 3;
        // System.out.println(i);
        // i = 10 % 3;
        // System.out.println(i);
        // // int x = 10; 9行目で定義
        // x++;
        // System.out.println(x);
        // x--;
        // System.out.println(x);

        // int x = 5;
        // // x = x+12;
        // x += 12; // ↑と同じ意味
        // System.out.println(x);

        String s;
        s = "hello " + " world";
        System.out.println(s);
    }
}
