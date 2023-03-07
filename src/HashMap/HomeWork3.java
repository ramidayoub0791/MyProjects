package HashMap;
import java.util.LinkedHashSet;



import java.util.LinkedHashSet;

public class HomeWork3 {
    public static void main(String[] args) {


        LinkedHashSet<String> stringSet = new LinkedHashSet<>();

        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("cherry");
        stringSet.add("banana");
        stringSet.add("apple");


        StringBuilder sb = new StringBuilder();

        for (String str : stringSet) {
            sb.append(str);
        }

        String concatenatedString = sb.toString();

        System.out.println(stringSet);
        System.out.println(sb.toString());

    }
}

/*4)Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
