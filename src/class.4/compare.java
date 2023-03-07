package myHomeWorkss;

import java.util.Scanner;
public class compare {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter two strings ");
        String word1 = inp.next();
        String word2 = inp.next();

        System.out.println("Please enter two numbers ");
       int number1 = inp.nextInt();
        int number2 = inp.nextInt();

        if ((number1 == number2) && (word1.equals (word2)))  {
            System.out.println("AND");
        }
  else if ((number1 == number2) ||(word1.equals (word2))){
            System.out.println("OR");
        }
  else if ((number1 != number2) ||(!word1.equals (word2))){
            System.out.println("NONE");
        }
    }
}