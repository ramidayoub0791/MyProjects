package myHomeWorkss;
import java.util.Scanner;
public class replitt {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.next();
        //write your code below
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                continue;
            }else {
                //   System.out.print(word.charAt(0));
            }
           System.out.print(word.charAt(i));

        }
        System.out.print(word.charAt(word.length()-1));
    }
}
//do not print the repeated letters