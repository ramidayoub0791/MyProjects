package homeWorks;

public class subSuper {
    public static void main(String[] args){
        son s=new son();
        son s1=new son(10);
    }
}
class father{
    int number=10;
    void diss(){System.out.println(number);}
    void dis(){System.out.println("Parent Constructor without argument");}
    father(){this.dis();}
    father(int number){this.diss();}
}
class son extends father{
    void display(){System.out.println("Child Constructor without argument");}
    son(){this.display();}

    son(int i){super(10);}
}