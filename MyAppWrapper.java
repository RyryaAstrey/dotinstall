public class MyAppWrapper {
    public static void main(String[] args) {
        // Integer i = new Integer(32);
        // int n = i.intValue();

        // 3,4行目と同じ意味
        Integer i = 32; // auto boxing
        i = null;
        int n = i; // auto unboxing
    }
}
