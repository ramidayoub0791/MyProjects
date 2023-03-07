package homeWorks;

import homeWorks.Dog1;

public class task2 {
    public static void main(String[] args) {
       /*    2) Create a Dog Class and create 3 different objects of it:
        Husky, Bulldog, Labrador  with specific  attributes and behaviors.*/
        Dog1 Husky = new Dog1();
        Dog1 Bulldog = new Dog1();
        Dog1 Labrador = new Dog1();

        Husky.aggressive();
        Husky.price = 2000;

        Labrador.active();
        Labrador.hairLong = true;

        Bulldog.emotional();
        Bulldog.size = "small";
    }
}