package homeWorks;

import java.util.Arrays;

public class homeWork6 {
    public static void main(String[] args) {
        /*  6)Write a program to swap 2 numbers without a temporary variable? */
        int[] ints={1,14,73,5,17,91,80};
       int sum= ints[1]+ints[5];
       ints[1]=ints[5];
       ints[5]=sum-ints[1];
        System.out.println(Arrays.toString(ints));
    }
}
