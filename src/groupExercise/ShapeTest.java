package groupExercise;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] items={new Circle(),new Square()};
        for (Shape item :items){
            item.calculateArea();
            item.calculatePerimeter();
        }
    }
}
