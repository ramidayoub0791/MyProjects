package classObject;

public class questionMarkJob {
    public static void main(String[] args) {
        int number=0;
        number=(2<3)?10:20;
        System.out.println(number);

        number=(3<2)?(4<5)?15:65:28;
        System.out.println(number);
    }
}
