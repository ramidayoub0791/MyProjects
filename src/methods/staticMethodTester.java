package methods;

public class staticMethodTester {
    public static void main(String[] args) {
        System.out.println(staticMethod.name="Messi");
        System.out.println(staticMethod.price=200000000);
        staticMethod.sales();
        /* no need to create an object and then call the method sales, just we call the class directly and we use (.)
        then we call the method after the (.), because we have a static method and this method uses one or more static variables. */
    }
}
