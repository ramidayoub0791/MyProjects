package homeWorks;

import java.util.ArrayList;

public class lastDuty4 {
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Juice");
        drinks.add("bobo");
        drinks.add("AlKohool");
        drinks.add("tea");
        drinks.add("cofee");

         for (int i=0;i<drinks.size();i++){
             if (drinks.get(i).contains("a")||drinks.get(i).contains("e")) {
                 drinks.set(i, "water");
             }
        }
        System.out.println(drinks);
    }
}

/*4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.*/
