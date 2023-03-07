package classObject;

import java.util.Scanner;

public class credentialChecker {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter username");
        String username=scanner.nextLine();
        System.out.println("please enter your password");
        String password=scanner.nextLine();
        System.out.println("please enter your password again");
        String confirmPasswoed=scanner.nextLine();
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("username or password can not be empty");
        }else if (password.length()<8){
            System.out.println("password is too short");
        } else if (password.contains(username)) {
            System.out.println("password can not contain username");

        } else if (!password.equals(confirmPasswoed)) {
            System.out.println("password does not match");
        }else {
            System.out.println("your username and password have been created");
        }
    }
}
