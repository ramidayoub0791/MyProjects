package homeWorks;

public class tteesstt {


    final void dis1(){
        System.out.println("");
    }
    final void  dis2(){
        System.out.println("Hello");
    }

    final void dis1(boolean r){
        System.out.println("Final method with boolean parameter");
    }

     final void dis2(String s){
        System.out.println("Final method with String parameter");
    }
    public static void main(String[] args){
        tteesstt m=new tteesstt();
        m.dis1(true);
        m.dis2("Rami");
    }
}
