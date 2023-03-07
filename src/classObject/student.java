package classObject;

public class student {
    String name;
    String id;
    static String schoolName;
    int age;
    double weight;

    void printName(){
        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printStudent(){
        //instance variable is not accessible from static method
      //  System.out.println(name);
        System.out.println(schoolName);
    }
}
