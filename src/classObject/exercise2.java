package classObject;

public class exercise2 {
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a.split("[?, ]").length);
        //and to print one of the sentences :
        String[]b=a.split("[?]");
        System.out.println(b[1]);


    }
}
  //  You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
//  How would you find out how many sentences are in that String?