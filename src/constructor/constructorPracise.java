package constructor;

public class constructorPracise {

    /*
    Write a java class that have 4 constructors with
    4 different access levels of constructors(private,public,default,
    protected) and create 4 objects of this class: 1 - inside
    same class; 2 - from outside the class; 3 - from different class inside
    different package  and observe result.
     */

        private constructorPracise(){
            System.out.println("Constructor without any parameters");
        }

        constructorPracise(String name){
            System.out.println("Constructor with a String as parameter");
        }


        protected constructorPracise(int number){
            System.out.println("Constructor with an int as parameter");
        }


        public constructorPracise(char c){
            System.out.println("Constructor with a char as parameter");
        }

        public static void main(String[] args) {
            constructorPracise task1=new constructorPracise();
            constructorPracise task2=new constructorPracise("Java");
            constructorPracise task3=new constructorPracise(1000);
            constructorPracise task4=new constructorPracise('G');
        }
    }

