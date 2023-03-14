package goodExample;
public class LongestEvenString {
    public static void main(String[] args) {
        try {
            System.out.println(longestEvenString("find MaxLen Even"));

            System.out.println(longestEvenString("I am very Good at Java"));

            System.out.println(longestEvenString("I was"));
        } catch (Exception e) {
          //  System.out.println(e.getMessage());
            System.out.println("-1");
        }
    /*    finally {
            System.out.println("-1");
        }*/
    }

    public static String longestEvenString(String test) {

        String[] words = test.split(" ");

        int maxlen = 0;
        String output = "";
        for (String word : words) {

            if (word.length() > maxlen && word.length() % 2 == 0) {
                maxlen = word.length();
                output = word;
            }
              /*  else {
                        throw new RuntimeException("-1");
                    }
                }*/

//        returns maximum_even_length word which occurred first

        }
        return output;
    }
}



/*class Main {
    public static void main(String[] args) {
        try {
            System.out.println(largestEvenLengthWord("find MaxLen Even"));

            System.out.println(largestEvenLengthWord("I am very Good at Java"));

            System.out.println(largestEvenLengthWord("I was"));
        }catch (Exception e){
         //   System.out.println("-1");
        }
    }
        public static String largestEvenLengthWord(String str) {
            String[] words = str.split( "\\s+");
            String maxEvenWord = "";
            for (String word : words) {
                if (word.length() % 2 == 0 && word.length() > maxEvenWord.length()) {
                    maxEvenWord = word;
                }
            }
            return maxEvenWord.equals("") ? "-1" : maxEvenWord;
        }
    }
    /* Find the largest even length word from a String
if there are two words with same largest even length return the first one.
if there are not even words return -1
input ["find MaxLen Even"]
output ["MaxLen"]
input["I am very Good at Java"]
output ["very"]
input["I was"]
output ["-1"] */

