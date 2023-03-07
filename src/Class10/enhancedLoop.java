package Class10;

import java.util.Scanner;

public class enhancedLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];       //{10, 13, 20, 25, 45, 50};

        for ( int x : arr) {
            System.out.println("please enter array values :");
                x=scan.nextInt();
            if (x % 2 != 0) {
                System.out.print(x+" ");
            }
           System.out.println(x);
        }


    }
}
