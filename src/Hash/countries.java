package Hash;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class countries {
    public static void main(String[] args) {
        TreeSet<String>cou=new TreeSet<>();
        cou.add("usa");
        cou.add("Canada");
        cou.add("Syria");
        cou.add("France");
        cou.add("England");
        System.out.println(cou);
// OR :
        for (String c:cou){
            System.out.println(c);
        }

// OR ;
     /*   TreeMap<String, Integer>con=new TreeMap<>();
        con.put("usa",2);
        con.put("Canada",10);
        con.put("Syria",8);
        con.put("France",5);
        con.put("England",2);

        System.out.println(con);*/
    }
}
/*Create a Set collection in which you need to add names of the countries.
 In this set we want all objects to be sorted in alphabetical order.
 Using 2 different ways retrieve all elements from set.
 */