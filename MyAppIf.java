public class MyAppIf {
    public static void main(String[] args) {
        // if
        int score = 65;
        if (score > 80) {
            System.out.println("Great!");
        } else if (score > 60) {
            System.out.println("Good!");
        } else {
            System.out.println("so so ... !");
        }
        String msg = score > 80 ? "Great!" : "so so ... !";
        System.out.println(msg);
    }
}