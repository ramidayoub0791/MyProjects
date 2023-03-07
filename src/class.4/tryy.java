package myHomeWorkss;


import java.util.Scanner;
public class tryy {
    public static void main(String[] args) {

        Scanner write = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String car = write.next();

        switch(car){
            case "BMW": System.out.println("Your favorite car is german car");break;

            case "Toyota": System.out.println("Your favorite car is japanese car");break;

            case "Maserati": System.out.println("Your favorite car is italian car");break;

            default: System.out.println("Your favorite car is unknown");



        }

        int i=1;

        while(i<14){

            if(i%2==0){
                System.out.println(i);
            }
            else{

            }
            i++;
        }
    }
}