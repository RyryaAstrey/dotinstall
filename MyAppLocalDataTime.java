import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyAppLocalDataTime {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now(); // 現在時刻を取得する
        // LocalDateTime d = LocalDateTime.of(2016, 1, 1, 10, 10, 10); // 2016年1月1日10時10分10秒を取得
        // LocalDateTime d = LocalDateTime.parse("2016-01-01T10:10:10"); // 同上

        System.out.println(d.getYear()); // 今年を出力
        System.out.println(d.getMonth()); // 月を出力 ただし定数（今月の英語表記）が返ってくる
        System.out.println(d.getMonth().getValue()); // 今月の数字を出力

        System.out.println(d.plusMonths(2).minusDays(3)); // 今日の日付から二ヶ月分足して三日分引く

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!"); // 現在日時を取得（7行目と同じ）し、ofPatternで指定したようにする。
        System.out.println(d.format(dtf)); // dtfで取得した日時を出力

    }
}
