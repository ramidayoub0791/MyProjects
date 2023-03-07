package myHomeWorkss;

public class override {
    int balance=100000;
    int interest;
    void calculate(){
        System.out.println(interest=balance*3/100);
    }
}

class visa extends override{

}

class AX extends override{
    void calculate(){
        System.out.println(interest=balance*2/100);
    }
}

class clac {
    public static void main(String[] args) {
        override over=new override();
        over.calculate();

        visa vis=new visa();
        vis.calculate();

        AX ax=new AX();
        ax.calculate();
    }
}
 /*   Create a class CreditCard and define variable balance and interest.
  Create an instance method that will calculate interest based on the given balance.
        Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
        Call the method by creating an object of each of the three classes.*/