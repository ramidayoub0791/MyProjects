package myHomeWorkss;

import java.util.Scanner;

public class ORExercise {
    public static void main(String[] args) {
       Scanner write = new Scanner(System.in);
        System.out.println("enter month :");
        String month = write.next();

       if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase ("August") || month.equalsIgnoreCase("July")) {
            System.out.println("summer");
        } else if (month.equals("September") || month.equals("October") ||month.equals ("November")) {
            System.out.println("Autoumn");
        } else if (month.equals("December") ||month.equals ("January") || month.equals("February")) {
            System.out.println("Winter");
        } else if (month.equals("March") ||month.equals ("April") ||month.equals ("May")) {
            System.out.println("Spring");
        } else {
            System.out.println("invalid");
        }
    }
}