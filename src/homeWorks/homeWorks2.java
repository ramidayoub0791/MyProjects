package homeWorks;

import java.util.Scanner;

public class homeWorks2 {
    public static void main(String[] args) {
        /*   2)Using Scanner create an array of countries. When an array is created,
        retrieve all values from it and while retrieving those values print capital for each country.
         (use 2 different loops).*/

        Scanner s=new Scanner(System.in);
        String[]countries= new String[5];
        for (int i=0;i<countries.length;i++){
            System.out.println("please enter a country name :");
            countries[i]=s.next();
            System.out.println("please enter the capital of the country :");
            String capital=s.next();
            System.out.println("the capital of "+countries[i]+ "  is "+capital);
        }
    }
}
