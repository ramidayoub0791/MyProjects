package constructor;

public class constructorChain {

    constructorChain(){
            System.out.println("I am non argument constructor");
        }

    constructorChain(String str){
            this(); //making a call to non argument constructor
            //this() -> ALWAYS must be on the first line
            System.out.println(str);
        }

    constructorChain(String str, int number){
            this(str);
            System.out.println("This is construtor with int parameter"+number);
        }

        public static void main(String[] args) {
            constructorChain obj=new constructorChain("hello",20);
            System.out.println("---  End of the code ------");
        }

    }

