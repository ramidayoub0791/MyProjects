package replitttt;


class testerrr {
        public static void main(String[] args) {
            rami x=new rami();
            x.parentMethod();
            x.childMethod();
        }
    }
    interface ParentInterface{
        void parentMethod();
    }

interface ChildInterface extends ParentInterface{
    void childMethod();
}
class rami implements ChildInterface{
public void parentMethod(){
        System.out.println("Parent Method-welcome to Syntax");
        }
public void childMethod(){
        System.out.println("Child Method-hello Syntax");
        }
        }

