package HashMap;

import java.util.Map;
        import java.util.TreeMap;

public class Vvar {
    public static void main(String[] args) {
          /*
        Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
         */

        Map<String, String> countries = new TreeMap<>();
        countries.put("Morocco", "Rabat");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");

        var values=countries.values();
        for (var value:values) {
            System.out.println(value);
        }

        var iterator=countries.values().iterator();
        while (iterator.hasNext()){

            var value=iterator.next();
            System.out.println(value);
        }

    }
}