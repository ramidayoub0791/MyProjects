package homeWorks;

import java.util.ArrayList;

public class lastDuty3 {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("hello");
        words.add("welcome");
        words.add("hii");
        words.add("bye");
        words.add("salut");

        words.removeIf(word->word.endsWith("e"));

            System.out.println(words);
        }
    }

/*3)Create an arrayList of words. Remove every word that ends with “e”.*/
