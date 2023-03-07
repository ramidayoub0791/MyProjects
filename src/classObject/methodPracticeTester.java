package classObject;

public class methodPracticeTester {
    public static void main(String[] args) {
        methodPractice even=new methodPractice();
        boolean isEven=even.evenNumber2(5);
        System.out.println(isEven);
        //or directly :
        System.out.println(even.evenNumber1(4));
    }
}
