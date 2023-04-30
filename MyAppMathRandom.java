import java.util.Random;

public class MyAppMathRandom {
    public static void main(String[] args) {
        double d = 53.234;
        System.out.println(Math.ceil(d)); // 54 小数点以下切り上げになる
        System.out.println(Math.floor(d)); // 53 小数点以下切り捨てになる
        System.out.println(Math.round(d)); // 53 四捨五入
        System.out.println(Math.PI); // 円周率を発生させる
        
        Random r = new Random();
        System.out.println(r.nextDouble()); // 0~1未満をランダムに取得
        System.out.println(r.nextInt(100)); // 0~100未満をランダムに取得
        System.out.println(r.nextBoolean()); // trueとfalseをランダムに取得
    }
}
