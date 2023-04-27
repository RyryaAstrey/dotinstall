public class MyAppFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // break;// iが5になったら処理を終了する
                continue; // iが5の時は次の処理に移る（iが5の場合はiを表示しない)
            }
            System.out.println(i);
        }
    }
}
