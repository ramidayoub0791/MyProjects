package myHomeWorkss;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Are you Ready for holidays");
        boolean ready=input.nextBoolean();
        System.out.println("we are ready for holidays "+ready);
    }
}
