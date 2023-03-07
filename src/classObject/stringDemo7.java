package classObject;

public class stringDemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startWish=str.startsWith("I");
        System.out.println(startWish);
        System.out.println(str.endsWith("java"));
        System.out.println(str.toLowerCase().startsWith("i"));
        System.out.println(str.contains("java"));

    }
}
