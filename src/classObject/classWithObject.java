package classObject;

public class classWithObject {
    public static void main(String[] args) {
        /*Create a Class Main

In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().

Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.*/
        animal Husky = new animal();
        Husky.name="Husky";
        Husky.color="black";
        Husky.bread="wawoo";
        Husky.bark("Husky","bark");
        Husky.run("Husky","run");
        Husky.play("Husky","play");

        animal Bulldog = new animal();
        Bulldog.name="Buldog";
        Bulldog.color="white";
        Bulldog.bread="whooof";
        Bulldog.bark("Bulldog","bark");
        Bulldog.run("Bulldog","run");
        Bulldog.play("Bulldog","play");

        animal Labrador = new animal();
        Labrador.name="Labrador";
        Labrador.color="gray";
        Labrador.bread="wiwiii";
        Labrador.bark("Labrador","bark");
        Labrador.run("Labrador","run");
        Labrador.play("Labrador","play");


    }
}

        class animal{
            String bread;
            String name;
            String color;

            void bark(String kind,String doing){
                System.out.println(kind+" can "+doing);
            }

            void run(String kind,String doing){
                System.out.println(kind+" can "+doing);
            }

            void play(String kind,String doing){
                System.out.println(kind+" can "+doing);
            }
        }


