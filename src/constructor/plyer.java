package constructor;

public class plyer {
    String name;
    int age;
    char preferredFoot;
    plyer(String playerName, int playerAge, char playerPreferredFoot){
        name=playerName;
        age=playerAge;
        preferredFoot=playerPreferredFoot;
    }

    plyer(){
        System.out.println("He is a great player");
    }

    void printing(){
        System.out.println(name+" "+age+" "+preferredFoot);
    }
}
/* Write a java class that will have a constructor: one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.*/

