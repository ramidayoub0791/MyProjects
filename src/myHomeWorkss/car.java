package myHomeWorkss;

public class car {

    /*    String make="Toyota";
        String model="Prius";
        int numberOfDoors=4;
        int topSpeed=120;
        double price=30000;*/

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;


        car(String make,String model,int numberOfDoors,int topSpeed,double price){
            this.make=make;
            this.model=model;
            this.numberOfDoors=numberOfDoors;
            this.topSpeed=topSpeed;
            this.price=price;
            this.display();

        }

        car(String make,String model,int topSpeed,double price){
            this.make=make;
            this.model=model;
            numberOfDoors=4;
            this.topSpeed=topSpeed;
            this.price=price;
            this.display();
        }

        car(int numberOfDoors,int topSpeed,double price){
           this.make="unknown";
            this.model=model;
            this.numberOfDoors=numberOfDoors;
            this.topSpeed=topSpeed;
            this.price=price;
            this.display();
        }

        car(String make,String model,int numberOfDoors){
           this.make=make;
            this.model=model;
            this.numberOfDoors=numberOfDoors;
            topSpeed=90;
            this.price=3000.0;
            this.display();
        }

    void display(){
        System.out.println(make+" "+ model+" "+ numberOfDoors+" "+ topSpeed+" "+ price);
    }

    public static void main(String[] args){
        car pr=new car("Toyota","Prius",4,120,3000.0);

        car pr1=new car(4,120,3000);

        car pr2=new car(4,120,3000);

        car pr3=new car("Toyota","Prius",4);
    }
}


