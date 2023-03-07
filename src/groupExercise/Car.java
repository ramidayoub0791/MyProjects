package groupExercise;

public abstract class Car {
    String color;
    int price;
    abstract int calculateSalePrice(int price, double i);

}

 class Sedan extends Car{
   // int price=30000;
    int calculateSalePrice(int price,double i){
        if(i>20){
            price=price*95/100;
        }else {
            price=price*90/100;
        }return price;
    }
}
 class Truck extends Car{
  // int price=50000;
    int calculateSalePrice(int price, double i){
        if (i>2000){
            price=price*90/100;
        }else {
            price=price*80/100;
        }
        return price;
    }
}

/* 3. Create a Class Car that would have the
following fields: carPrice and color and method
calculateSalePrice() which should be returning
a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class has a field as weight and has its own
implementation of calculateSalePrice() method
in which returned price is calculated as
following: if weight>2000 then returned price
car should include 10% discount, otherwise 20%
discount.
The Sedan class has field as length and also
does it is own implementation of
calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5%
discount, otherwise 10% discount */

