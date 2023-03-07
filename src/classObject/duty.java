package classObject;

import java.util.Scanner;

public class duty {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string name");
        String name=input.next();
    if (!name.isEmpty()){

        if ((name.length()%2!=0)&&(name.length()>=3)) {
            System.out.println(name.charAt((name.length())/2));
        }
    }
    }
}
  /*  Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        For Example String str=hello =>l*/