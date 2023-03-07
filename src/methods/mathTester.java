package methods;

import java.util.Scanner;

public class mathTester {
    public static void main(String[] args) {
        math rami=new math();

        rami.add(5,10);
       rami.mul(3,2,4);
        
       int result= rami.sub(100,20);
        System.out.println(result);
    }
}
