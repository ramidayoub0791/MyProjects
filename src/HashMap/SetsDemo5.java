package HashMap;

import java.util.ArrayList;
        import java.util.LinkedHashSet;

public class SetsDemo5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        System.out.println(numbers);
        // Write some logic to remove duplicates from above list
        LinkedHashSet<Integer> uniqueNumbers=new LinkedHashSet<>(numbers);
        System.out.println(uniqueNumbers);

    }
}