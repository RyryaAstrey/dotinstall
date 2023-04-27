public class MyAppArray {
    public static void main(String[] args) {
        // int[] sales;
        // sales = new int[3]; // sales配列は3まであることを示している。
        // sales[0] = 100;
        // sales[1] = 200;
        // sales[2] = 300;

        // int[] sales;
        // sales = new int[] { 100, 200, 300 }; // 上記3~7行目と同じ意味になる。こちらの方が単純。

        int[] sales = { 100, 200, 300 }; // こちらも上記と同じ意味。より単純になっている。

        System.out.println(sales[1]);

        sales[1] = 1000; // 変数sales[1]を1000に上書きする

        System.out.println(sales[1]);
    }
}
