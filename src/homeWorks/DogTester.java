package homeWorks;

public class DogTester {
    public static void main(String[] args) {
        Dog dog1=new Dog();

        dog1.sleep();
        dog1.eats();
        dog1.bark();
        dog1.weight=12.3;
        dog1.name="Jacky";
        dog1.attitude=false;


        Dog Rax=new Dog();
        System.out.println("Let's go eat ");
        dog1.eats();

        Rax.age=11;
        Rax.attitude=true;


    }
}
