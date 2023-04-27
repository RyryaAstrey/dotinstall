public class MyAppDatatype {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        y = 5;
        System.out.println(x);
        System.out.println(y);

        // 参照型の場合
        int[] a = { 3, 5, 7 };
        int[] b = a; // 参照型のデータ型の場合、この処理でbとaの配列が同じ扱いになる。
        b[1] = 8; // この処理でaの配列の1番目(5)も8に変わる。
        System.out.println(a[1]);
        System.out.println(b[1]);

        // String型のみ参照型の中で特殊
        String s = "hello";
        String t = s;
        t = "world"; // String型の場合、参照型ではあるがここでsの値が書き変わらず基本型と同じような動作になる。
        System.out.println(s);
        System.out.println(t);
    }
}
