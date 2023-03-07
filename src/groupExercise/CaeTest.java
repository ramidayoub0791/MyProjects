package groupExercise;

public class CaeTest {
    public static void main(String[] args) {
        Car c=new Sedan();
        System.out.println("The final price of the sedan car if :"+c.calculateSalePrice(20000,30));
        Car t=new Truck();
        System.out.println("The final price of the Truck car if :"+t.calculateSalePrice(20000,3000));
    }
}
