package classObject;

import java.util.Scanner;

public class duty2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter father name :");
        String dad=input.next();
        System.out.println("please enter mother name :");
        String mom=input.next();
        System.out.println("what do you expect, boy or girl? ");
        String baby=input.next();
        if (baby.equals("boy")){
            System.out.println("the suggested baby name is : "+dad.substring(0, dad.length()/2)+mom.substring(mom.length()/2));
        } else if (baby.equals("girl")) {
            System.out.println("the suggested baby name is : "+mom.substring(0, mom.length()/2)+dad.substring(dad.length()/2));
        }
    }
}
  /*  Write a program that reads two people's first
        names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL*/