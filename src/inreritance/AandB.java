package inreritance;

public class AandB {
     void printF(){
        System.out.println("Maraheb");

    }
   int num =3000;
}

class B extends AandB{
    int num;
   void printF(){
System.out.println("Ahlaaaa");
    }
     void callStatic(){
       super.printF();
         System.out.println(super.num);
    }

    public static void main(String[] args) {
        B b=new B();
        b.callStatic();
    }
}
/*Write program to inherit class A that has method printF which is static and call or reuse that method into class B*/

