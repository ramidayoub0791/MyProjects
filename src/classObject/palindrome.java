package classObject;

public class palindrome {
    String palind(String pal){
        StringBuilder lap=new StringBuilder(pal);
     //   String lapp= String.valueOf(lap.reverse());
        lap.reverse();
        String reversed=lap.toString();
      //  String lapp= String.valueOf(lap.reverse());
      //  if (lapp.equals(pal)){
        if (reversed.equals(pal)){
            return "palindrome";
        }else {
            return "not palindrome";
        }
    }
    void isit(String pal){
        String str="dad";
        StringBuilder st=new StringBuilder(pal);
        st.reverse();
        String reversed=st.toString();
        if (pal.equals(reversed)){
            System.out.println(pal+" is palindrome");
        }else {
            System.out.println(pal+" is not palindrom");
        }
    }
}
