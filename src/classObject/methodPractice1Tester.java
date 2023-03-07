package classObject;

public class methodPractice1Tester {
    public static void main(String[] args) {
        methodPractice1 rev=new methodPractice1();
        System.out.println(rev.reverse("Saturday"));

        String result=rev.reverseStr("Friday");
        System.out.println(result );

        System.out.println(rev.reverseStr1("Monday"));

    }
}
