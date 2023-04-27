public class MyApp3 {
    public static void main(String[] args) {
        // データ型を他のデータ型に書き換えることを「キャストする」と言う
        double d = 52343.231;
        int i = (int) d; // 「(int)」を入れることによって、int型に変換できる。ないとエラーになる。
        System.out.println(i);

        int j = 10;
        double e = (double) j / 4; // jをdouble型にキャストしないと、整数型の状態で計算が行われ、余りが切り捨てられて2.0になってしまう。
        System.out.println(e);
    }
}
