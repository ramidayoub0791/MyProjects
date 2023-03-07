package classObject;

public class personTester {
    public static void main(String[] args) {
        person per=new person();
     //error :   System.out.println(per.bankBalance);
        System.out.println(per.address);
        System.out.println(per.name);

     //error :   per.printPassword();
        per.printTicTocAccount();
        per.printSSN();
    }
}
