package constructor;

public class boook {
   String name;
   int year;
   String country;

   boook(String name){
       System.out.println("The book name is "+name);
   }

   boook(String name,int year,String country){
       this( name);
       System.out.println("The book "+name+" of year "+year+" was produced in "+country);
   }

    public static void main(String[] args) {
        boook book=new boook("the war",1990,"Russia");
        }}

/*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed*/