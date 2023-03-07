package class3;

public class Task5 {
    public static void main(String[] args) {
        /*
        TASK: Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
         Your program should say. “The perimeter of a rectangle with width  and height  is equal to  and the area is __”
        The perimeter of a rectangle with width 5.0 and height 8.0 is equal to 26.0 and the area is 40.0/
         */
        double width=5;
        double height=8;
        System.out.println(width*height);
        System.out.println(2*(width+height)); // () if we those calculation get priority
    }
}
