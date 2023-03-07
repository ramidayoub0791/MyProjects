package classObject;

public class exercise {
    public static void main(String[] args) {
        String sentence="I love java so much";
        String removeSpaces=sentence.replace(" ","");
        System.out.println(removeSpaces);

        //or by another way:
      //  String removeSpaces=sentence.replaceAll("[^a-zA-Z]","");
      //  System.out.println(removeSpaces);

    }
}
 //   Create a String that will hold a sentence. Write a program to get a new String without any spaces.