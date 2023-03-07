package homeWorks;

import java.util.ArrayList;

public class lastDuty {
    public static void main(String[] args) {
        ArrayList<String> arrayLisr=new ArrayList<>(5);
        arrayLisr.add("Rami");
        arrayLisr.add("Taim");
        arrayLisr.add("Jad");
        arrayLisr.add("Sawsan");
        arrayLisr.add("Rami1");

        System.out.println(arrayLisr.isEmpty());
        System.out.println(arrayLisr.contains("Taim"));
        System.out.println(arrayLisr.size());
    }
}
  /*  Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that*/

