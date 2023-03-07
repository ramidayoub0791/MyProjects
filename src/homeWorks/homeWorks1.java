package homeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class homeWorks1 {
    public static void main(String[] args) {
     /*   1)Using Scanner create an array of integer values. After the array is created,
     calculate the sum of all stored elements in that array.
      */
        Scanner s=new Scanner(System.in);
        int[]values=new int[6];
        int sum=0;
        for (int i=0;i<values.length;i++) {
            System.out.println("please enter the "+i+" integer values of the array ");
            values[i]=s.nextInt();
            sum+=values[i];
        }
        System.out.println(Arrays.toString(values));
        System.out.println("the sum of the values if : "+sum);
    }
}
