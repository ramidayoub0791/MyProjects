package homeWorks;

import java.util.Scanner;

public class homeWork7 {
    public static void main(String[] args) {
        /* 7)Write a java program to check whether a given number is prime or not?*/
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number :");
        int num=input.nextInt();
                for (int x = 2; x <= num/2; x++) {
                    if (num % x != 0) {
                        System.out.println(num + " is a prime number");break;
                    } else {
                        System.out.println(num + " is not a prime number");break;

                    }
                }
            }
        }


