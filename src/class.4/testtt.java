package myHomeWorkss;

import java.util.Scanner;
class Main {
    public static void main(String [] args){
        Scanner write=new Scanner(System.in);
        System.out.println("Do you need a loan?");
           boolean answer=write.nextBoolean();
           if(answer){
            System.out.println("What is your credit score?");
            int score=write.nextInt();
            if(score<600){
                System.out.println("The eligibility is "+"Not eligible ");
            }
            else if(score>=600 && score <+700){
                System.out.println("The eligibility is "+"Maybe eligible");
            }
            else if(score>700 && score <=800){
                System.out.println("The eligibility is "+"Eligible");
            }
            else{
                System.out.println("Definitely eligible");
            }
         }
        else{
               System.out.println("The eligibility is Unknown");
        }
    }
}