package classObject;

public class exercise5 {
    public static void main(String[] args) {
        String x="I love ";
        String y="java";
        x=x+y;
        y=x.substring(0,x.length()-y.length());
        x=x.substring(y.length());

        System.out.println("x is :"+x);
        System.out.println("y is :"+y);

    }
}
//How would you swap  2 strings without a temporary variable?