package HashMap;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        // Does not allow duplicates and retains the insertion order
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Apple");

        System.out.println(fruit);
    }
}
