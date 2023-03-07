package classObject;

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your string :");
        String str = scan.next();

        String rev = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            ans = true;
        }
        System.out.println(ans);
    }
}


// How would you check if String is palindrome or not? aba=> true
//        Abbc =>false