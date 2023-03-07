package myHomeWorkss;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        /*  3) Write a program that reads a range of integers (start and end point),
           provided by a user and then from that range prints the sum of the even and odd integers.*/
        Scanner inp = new Scanner(System.in);
        System.out.println("please enter start point :");
        int start = inp.nextInt();

        System.out.println("please enter end point :");
        int end = inp.nextInt();

        int sum = 0;
        int sum1 = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            } else {
                sum1 = sum1 + i;
            }
        }
                System.out.println("the sum of the even integers :" + sum);
                System.out.println("the sum of the odd integers :" + sum1);
        }
    }

