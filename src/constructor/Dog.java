package constructor;

public class Dog {
    String name;
    String bread;
    String color;
    int age;
    double weight;

    Dog(String dogName,String dogBread,String dogColor,int dogAge,Double dogWeight){
      name=dogName;
      color=dogColor;
      bread=dogBread;
      age=dogAge;
      weight=dogWeight;


        }
    void prinInfo(){
        System.out.println(name+" "+bread+" "+color+" "+age+" "+weight);
    }
}
