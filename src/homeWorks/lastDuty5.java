package homeWorks;

import java.util.ArrayList;

public class lastDuty5 {
    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<>(500);
        for (int j = 0; j < 500; j++) {
             if((j%2==0)&&(j%5!=0))
            even.add(j);
        }
          System.out.println(even);
    }
}


/*5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.*/

