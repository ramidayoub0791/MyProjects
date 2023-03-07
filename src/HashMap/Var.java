package HashMap;

import java.util.Map;
        import java.util.Set;
        import java.util.TreeMap;

public class Var {
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


        //Set<Map.Entry<String,String>> entrySet=countries.entrySet();
     /*   var entrySet=countries.entrySet();
        for (var entry:entrySet) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }*/
    // OR :
        var x=countries.entrySet().iterator();

        while (x.hasNext()){

           var y=x.next();

           System.out.println(y.getKey()+" "+ y.getValue());
        }

    }
}