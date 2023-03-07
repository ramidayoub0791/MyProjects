package methods;

import java.util.Scanner;

public class methodDemo1 {
   // defining a method
    void printHello(){
        System.out.println("Hello world");
    }

    void printHelloManyTimes(int times){
     for (int i=0;i<times;i++){
         System.out.println("Hello world");
     }
    }
    void printManyTimes(int times,String word){
        for (int i=0;i<times;i++){
            System.out.println(word);
        }
    }
}
