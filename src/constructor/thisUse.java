package constructor;

public class thisUse {

    class  Message{
        Message(){
            System.out.println("hello  a");
        }
        Message(int  p){
            this();
            System.out.println(""+p);
        }
    }
    class  ThisKeyword{
        public void  main(String  args[]){
            Message  a=new  Message(12);
        }
    }
}
