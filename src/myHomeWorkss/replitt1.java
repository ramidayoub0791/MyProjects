package myHomeWorkss;
import java.util.Scanner;
public class replitt1 {
    public static void main(String[] args) {


    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    for(int i=0;i<word.length();i++) {
        if (i %2==0 ) {
            System.out.print(word.charAt(i));

        }else {
           continue;
        }
    }
    }
}
