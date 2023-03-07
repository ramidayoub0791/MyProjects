package homeWorks;


 abstract class parent{
        abstract void m1();

        void m1(int i){
        System.out.println("m1 without parameters");
        }
        void m1(String s){
        System.out.println("m1 with parameter");
        }
        }

public abstract class tttest extends parent{
void dd(){
    System.out.println("hello");
}

    }
    class show{
        public static void main(String[] args){
            tttest x= new tttest() {
                @Override
                void m1() {

                }
            };
            x.m1(2);
            x.m1("Rami");
        }
    }

