package homeWorks;

public class task1 {
    public static void main(String[] args) {
        /*1) Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.*/
            phone iphone=new phone();
            phone Samsung=new phone();
            phone Pixel=new phone();

        System.out.println("For the iphone :");
            iphone.charge();
            iphone.color="black";
        System.out.println("its color is "+iphone.color);
        System.out.println("***************");
        System.out.println("For the Samsung :");
            Samsung.rearCamera();
            Samsung.memory=64;
        System.out.println("its memory is "+Samsung.memory);

        System.out.println("***************");
        System.out.println("For the Pixel :");
            Pixel.ring();
            Pixel.screenSize=6;
            Pixel.price=899.99;
        System.out.println("its price is "+Pixel.price);
        System.out.println("its screen size is "+Pixel.screenSize);
    }
}












