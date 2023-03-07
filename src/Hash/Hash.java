package Hash;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Hash {
    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        LinkedHashSet<String>list=new LinkedHashSet<>(aList);
        System.out.println(list);

    }
}
     //   How can you remove all duplicates from ArrayList?