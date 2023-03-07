package myHomeWorkss;

import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
         /* 4) Write a program to ask a user to enter item they want to buy and the price of that item.
         Every time user enters money accumulate the amount and tell the user how much is left to pay off.
         If user give more money program should return a change. Whenever a user done with payments program should say
         "Thank you for shopping!"*/
        Scanner s = new Scanner(System.in);
        int i = 0;
        int total = 0;
        boolean buy = true;
        boolean checkout = false;
        while (buy) {
            System.out.println("enter item you want to buy and the price of that item");
            int price = s.nextInt();
            total = total + price;
            System.out.println("Total amount checkout: " + total);
            System.out.println("checkout");
            checkout = s.nextBoolean();
            if (checkout == true) {
                buy = false;
        System.out.println("pay");
        int payment = s.nextInt();
        int change = payment - total;
        System.out.println("return the change : " + change);
            }else {
                i++;
            }
        }

    }
}

