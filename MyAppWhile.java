public class MyAppWhile {
    public static void main(String[] args) {
        int i = 100;
        // while (i < 10) { // iが10になるまで処理を繰り返す
        // System.out.println(i); // iを表示する
        // i++; // iに１を足していく
        // // ここでwhile文のため５行目に戻る
        // }

        do {
            System.out.println(i); // iを表示する
            i++; // iに１を足していく
        } while (i < 10); // iが10になるまで10~11行目を繰り返す
    }
}
