package classObject;

public class person {
    private double bankBalance=125000;
    String address="Street 123";
    public String name="Rami";

    private void printPassword(){
        System.out.println("pas123");
    }

    void printSSN(){
        System.out.println("123456");
    }

   public void printTicTocAccount(){
        System.out.println("user123");
    }


    public static void main(String[]args){
        person per=new person();
        System.out.println(per.bankBalance);
        System.out.println(per.address);
        System.out.println(per.name);
        per.printPassword();
        per.printTicTocAccount();
        per.printSSN();

    }

}
