package inreritance;

public class shape {
int radius;
shape(int radius){
    this.radius=radius;
  }
}
class circle extends shape{
    circle(int radius) {
        super(radius);
    }
    void calculate(){
        System.out.println(3.14*radius*radius);
    }

    public static void main(String[] args) {
      circle calc=new circle(10);
      calc.calculate();
    }
}
/* 1. Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
 In circle class create a method to calculate the area of circle. Test your code
 */

