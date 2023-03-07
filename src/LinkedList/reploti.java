package LinkedList;

import java.util.LinkedList;

public class reploti {


   public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
       // Add integers from 50 to 100 to the list
       for (int i = 50; i <= 100; i++) {
           list.add(i);
       }

       // Remove numbers that are not divisible by 3
       for (int i = list.size() - 1; i >= 0; i--) {
           int num = list.get(i);
           if (num % 3 != 0) {
               list.remove(i);
           }
       }

       // Print the resulting list
       System.out.println(list);
    }
}