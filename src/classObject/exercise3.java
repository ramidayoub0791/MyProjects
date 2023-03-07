package classObject;

public class exercise3 {
    public static void main(String[] args) {

     /*   String str = "This is sentence i want to reverse";
        String[] strSplitted = str.split("\\s");
        String reverseWord = "";
        for (String w : strSplitted) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        System.out.println(reverseWord);*/


        //OR;
        String str="This is sentence i want to reverse";
        String[]arr=str.split(" ");
        for (String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
        //   for(int i=word.length()-1;i>=0;i--){
           //    System.out.print(word.charAt(i));
           }
         //   System.out.print(" ");
        }

    }

 /*   How would you reverse a String word by word? for example
 input=>This is sentence i want to reverse
 output=>sihT si ecnetnes i tnaw ot esrever*/