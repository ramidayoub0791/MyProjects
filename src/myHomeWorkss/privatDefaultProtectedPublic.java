package myHomeWorkss;

public class privatDefaultProtectedPublic {

     private String name = "John";
     String city = "Miami";
     protected String school = "Syntax";
     public String batChnumber = "batch 9";

    void display() {
        System.out.println("My name is " + name + " and I live in " + city + " I study at " + school + " in batch " + batChnumber);
    }

    public static void main(String[] args) {
        privatDefaultProtectedPublic a=new privatDefaultProtectedPublic();
   a.display();
    }
}