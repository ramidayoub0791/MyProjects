package myHomeWorkss;

public class tthirdLetter {
   // static String s;
   static String thirdLetter(String s){
     String word="";
        for(int i=0;i<s.length();i++){
            if(i%3==0){
                word+=s.charAt(i);
            }
        }
        return word;
    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
