package class6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double number1,number2,number3;
        System.out.println("Please Enter three Numbers");
        number1=scanner.nextDouble();
        number2=scanner.nextDouble();
        number3=scanner.nextDouble();

        if(number1>number2&& number1>number3){
            System.out.println("The Largest Number is "+ number1);
        } else if (number2>number3 && number2>number1) {
            System.out.println("The Largest Number is "+ number2);
        } else if (number3>number2&&number3>number1) {
            System.out.println("Largest number is "+ number3);
        }

    }
}
