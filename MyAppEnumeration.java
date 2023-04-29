enum Result {
    SUCCESS,
    ERROR,
}

public class MyAppEnumeration {
    public static void main(String[] args) {
        Result res;

        res = Result.ERROR;

        switch (res) {
            case SUCCESS:
                System.out.println("OK!");
                System.out.println(res.ordinal());
                break;
            case ERROR:
                System.out.println("NG!");
                System.out.println(res.ordinal());
                break;
        }
    }
}
