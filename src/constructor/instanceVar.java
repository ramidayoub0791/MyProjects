package constructor;

public class instanceVar {
    String name;
    String address;

    instanceVar(String sName,String sAddress){
        name=sName;
        address=sAddress;
    }

    void prin(){
        System.out.println(name+" "+address);
    }
}
/*5) Write a Student class   that have instance variables name and address.
 Create a constructor that will initialize those variables. Print name & address of given  student using displayInfo method.*/

