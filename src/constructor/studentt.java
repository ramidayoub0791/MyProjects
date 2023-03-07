package constructor;

public class studentt {

    String name;
    String address;


    studentt(String name, String address) {

        this.name = name;
        this.address = address;
    }
    void displayInfo () {
        System.out.println(name+" "+ address);
    }

    public static void main(String[] args) {
        studentt stud=new studentt("Rami","Montreal");
        stud.displayInfo();
    }
}

/*Write a Student class   that have instance variables name and address.
 Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.*/


