package class3;

public class Task4 {
    public static void main(String[] args) {
       /*
       Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The  of 2 numbers  and  is equal to __”
Expected Output:
The Addition of 2 numbers 10.5 and 10.5 is equal to 21.0
The Subtraction of 2 numbers 10.5 and 10.5 is equal to 0.0
The Multiplication of 2 numbers 10.5 and 10.5 is equal to 110.25
The Division of 2 numbers 10.5 and 10.5 is equal to 1.0
        */
        double number1=10.5;
        double number2=10.5;
        double addition=number1+number2;
        double subtraction=number1-number2;
        System.out.println("The Addition of 2 numbers "+number1+" and "+number2+" is equal to "+addition);
        System.out.println("The Subtraction of "+number1+" and "+number2+" is equal to "+subtraction);

        double square=number1*number1;
        System.out.println(square);
    }
}
