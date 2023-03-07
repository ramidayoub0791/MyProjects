package constructor;

public class DogTester {
    public static void main(String[] args) {


   Dog dog1=new Dog("rex","wawoo","black",6,12.3);

        Dog dog2=new Dog("Husky","nano","white",5,15.2);

        Dog dog3=new Dog("rita","roro","gray",7,8.5);

        Dog dog4=new Dog("shalit","shallo","golden",4,2.0);

        Dog dog5=new Dog("wahsh","wawa","black",2, 1.0);


        dog1.prinInfo();
        dog2.prinInfo();
        dog3.prinInfo();
        dog4.prinInfo();
        dog5.prinInfo();
}
}
