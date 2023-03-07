package classObject;

public class methods {
    public static void main(String[] args) {
        multiply(4, 5);
        multiply(8,7);
        divide(30, 6);
        welcome();
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);

    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void welcome (){
        System.out.println("Welcome to java");
        System.out.println("Hellooooo");
    }
}
