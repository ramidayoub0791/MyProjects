package HashMap;

import java.util.LinkedHashSet;
        import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Apple");

        System.out.println(fruit);
    }
}