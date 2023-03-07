package myHomeWorkss;

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        //     2) Create a program that will be asking user to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.
        Scanner s = new Scanner(System.in);
        String apply = null;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Would you please apply for a credit card ? ");
            apply = s.next();
            if (apply.equals("yes")) {
            break;
            }
        }
    }
}
