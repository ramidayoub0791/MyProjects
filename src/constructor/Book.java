package constructor;

public class Book {
    String name;
    int price;

    Book(String bName){
        name=bName;

    }

    Book(int bPrice){
        price=bPrice;

    }

    void printing(){
        System.out.println(name+" "+price);
    }
}
/*6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/