package classObject;

public class stringDemo8 {
    public static void main(String[] args) {
        String str="java is not a pain 123";
        System.out.println(str.indexOf("j"));
        System.out.println(str.indexOf("a"));

        int counter=0;
        int digit=0;
        int space=0;
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i) +" has the index "+i);
       if (Character.isAlphabetic(str.charAt(i))) {
          counter++;
         }
      else if (Character.isDigit(str.charAt(i))){
           digit++;
       }
      else if (Character.isSpace(str.charAt(i))){
         space++;
       }
       }
        System.out.println("letters are : "+counter);
        System.out.println("numbers ars : "+digit);
        System.out.println("spaces are : "+space);
    }
}
