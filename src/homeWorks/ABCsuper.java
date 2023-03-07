package homeWorks;

public class ABCsuper {

    public static void main(String[] args){
        C c=new C();
    }
}
class A{
    void prin(){System.out.println("I"); }
}
class B extends A{
    void prinn(){System.out.println("am");}

    B(){
        super.prin();
        this.prinn();
    }
}
class C extends B{
    void prinnn(){System.out.println("a tester"); }

    C(){
        super();
        this.prinnn();
    }
}