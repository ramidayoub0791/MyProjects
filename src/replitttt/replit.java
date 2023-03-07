package replitttt;

import java.util.ArrayList;
import java.util.Scanner;
public class replit {
    public static <iterator> void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int i=0;
       while (i<5) {
            nums.add(scanner.nextInt());
          i++;

        }
       for (Integer num:nums )
         System.out.println(num);
      /*  iterator<Integer>x=phone.iterator();
        while(x.hasNext()){
            System.out.println(x.next());*/
        }
    }
