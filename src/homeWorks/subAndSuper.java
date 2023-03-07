package homeWorks;

public class subAndSuper {
        public static void main(String[] args){
            SubClass sub=new SubClass();
           // sub.show(); ------->     no need
        }
    }

class superClass{
    void show(){
        System.out.println("This is Parent constructor");
    }
    superClass(){
        this.show();
    }
}
class SubClass extends superClass{
    SubClass(){
        super();
    }
}
