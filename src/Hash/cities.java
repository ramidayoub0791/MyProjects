package Hash;

import java.util.LinkedHashSet;

public class cities {
    public static void main(String[] args) {
        LinkedHashSet<String>city=new LinkedHashSet<>();
        city.add("Montreal");
        city.add("Damas");
        city.add("Alaba");
        city.add("Orlando");
        city.add("Phoenix");

        System.out.println(city);
        city.removeIf(x->x.startsWith("A"));
        // OR we can use iterator.
        System.out.println(city);
     //   System.out.println(city.clone());

    }
}
/*Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;*/
