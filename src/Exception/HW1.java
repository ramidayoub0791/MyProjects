package Exception;

public class HW1 {
    public static void main(String[] args) {
       try {
           System.out.println(5/0);
       }catch (ArithmeticException s){
           System.out.println("impossible");
       }
    }
}
/* 1) How would handle InputMismatchException?
Input Mismatch Exception when user enters mismatch value then programmer expected.*/


