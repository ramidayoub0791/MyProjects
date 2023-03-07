package myHomeWorkss;

public class testor {

    public static void main(String[] args){
        String type = new String();
        animal[]ans={new cat(),new Kitten1(),new Kitten2(),new Kitten3()};
        for(animal an:ans){
            an.eat();
            an.sleep();
        }
    }
}

class animal{
   String type;
    void eat(){
        System.out.println(" eats milk");
    }
    void sleep(){
        System.out.println(" sleeps well");
    }
    animal(){
        this.type=type;
    /*    this.eat();
        this.sleep();*/
   }
}

class cat extends animal{
    String type="cat";
    void eat(){
        System.out.println("Cat eats"); }
    void sleep(){System.out.println("Cat sleeps a lot");}}

class Kitten1 extends cat{
    String type="Kitten1";
    void eat(){System.out.println("kitten1 eats milk");}
    void sleep(){
        System.out.println("kitten1 sleeps a lot");
    }
}

class Kitten2 extends cat{
    String type="Kitten2";
    void eat(){ System.out.println("kitten2 eats snacks"); }
    void sleep(){System.out.println("kitten2 sleeps a lot");}
}

class Kitten3 extends cat{
    String type="Kitten2";
    void eat(){System.out.println("kitten2 eats everything");}
    void sleep(){System.out.println("kitten3 sleeps a lot");}
}