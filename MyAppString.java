public class MyAppString {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(s.length()); // lengthは文字列の長さを返してくれる。今回の場合は６
        System.out.println(s.substring(2, 5)); // ２番目のものから５番目のものを返してくれる。今回の場合はcde（aは0番目である）
        System.out.println(s.replaceAll("ab", "AB")); // 文字の置換をしてくれる。今回は「ab」と入力されたら「AB」と返してくれる。

        String s1 = "ab";
        String s2 = "ab";

        if (s1 == s2) {
            System.out.println("same!same!");
        }

        String ss1 = new String("ab");
        String ss2 = new String("ab");

        if (ss1 == ss2) {
            System.out.println("same!same!same!");
        }
    }
}
