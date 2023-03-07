package groupExercise;
public interface Shape{
    void calculateArea();
    void calculatePerimeter();
}
 class Circle implements Shape {
     @Override
    public void calculateArea(){
         System.out.println("Circle Area = PI * Radius *Radius");
     }

     @Override
     public void calculatePerimeter() {
         System.out.println("Circle Perimeter = PI * 2 * Radius");
     }
 }

class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("Square Area = side * side");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Square Perimeter = 4 * side ");
    }
}
/* 1. Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimeter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.*/


