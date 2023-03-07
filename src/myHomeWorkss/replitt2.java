package myHomeWorkss;
import java.util.Scanner;
public class replitt2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] names=new String[5];
        for(String name:names)
        {
            System.out.println("please enter three elements names :");
           name=scan.next();
            System.out.println(name.substring(0,3));
        }
     //   System.out.println(name.substring(0,3));
    }
    }

