package Exception;

public class HW4 {
    public static void CheckUserName(String name){
        if (name.length()<5){
            throw new RuntimeException("name is less than 5 characters is not eligible");
        }
    }

    public static void main(String[] args) {
        try {
            CheckUserName("Ramidayoub");
            System.out.println("name is eligible");
            CheckUserName("Rami");
            System.out.println("not eligible");
        }catch (RuntimeException e){
            System.out.println("name is not eligible :"+e.getMessage());
        }
    }
}

/* 4) Create a method checkUserName that will throw a runtime exception.
 Method should throw an exception when entered username is less than 5 characters.*/
