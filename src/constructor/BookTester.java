package constructor;

public class BookTester {
    public static void main(String[] args) {
        Book book1=new Book("the world");
        book1.printing();

        Book book2=new Book(75);
        book2.printing();


    }
}
