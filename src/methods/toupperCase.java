package methods;

public class toupperCase {



    String word(String x){
        return x.toUpperCase();
    }
    public static void main(String[]args){
        toupperCase upword=new toupperCase();
        System.out.print(upword.word("rami"));
    }
}
