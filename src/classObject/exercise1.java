package classObject;

public class exercise1 {
    public static void main(String[] args) {
      //  Create a String that should be combination of letters, numbers and special characters.
        //  Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
        String mix="ASdfS 8798h Lkj &%*^$";
        System.out.println(mix.replaceAll("[^a-zA-Z0-9]","").length());

    }
}
/* Create a String that should be combination of letters, numbers and special characters.
 Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
 */