public class MyAppSwitch {
    public static void main(String[] args) {
        // switch
        String signal = "green";
        switch (signal) {
            case "red":
                System.out.println("stop!");
                break;
            case "blue":
            case "green": // caseを並べて書くと、「青か緑の時は」という意味になる
                System.out.println("go!");
                break;
            case "yellow":
                System.out.println("caution!");
                break;
            default:
                System.out.println("wrong signal!");
                break;
        }
    }
}
