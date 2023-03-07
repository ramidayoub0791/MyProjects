package Interface;

public interface TrusAble {

    public static final   int age=10; // Constants
    String color="knfkjdnfk";
    int trust();

    static void method1(){
        System.out.println("Hello world");
    }

    default void method2(){

    }

    private void method3(){

    }
}

class Bank implements TrusAble{

    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrusAble.method1();
        System.out.println(TrusAble.age);
    }

}
