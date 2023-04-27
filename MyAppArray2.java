public class MyAppArray2 {
    public static void main(String[] args) {
        int[] sales = { 700, 400, 500 };

        // for (int i = 0; i < 3; i++) { // iが3になるまで繰り返す
        // for (int i = 0; i < sales.length; i++) { //
        // 「sales.length」は配列の最大値を表す。つまり3になるため、5行目と同じ意味になる。
        // System.out.println(sales[i]); //
        // sales配列の数値をiで指定している。iは0~2まで繰り返されるため、sales配列の中身が順番に取り出される。
        // }

        for (int sale : sales) { // salesの配列の中から１つずつ取り出してint型の変数saleに代入する。要約すると6~7行目と同じ処理をする。
            System.out.println(sale);
        }
    }
}
