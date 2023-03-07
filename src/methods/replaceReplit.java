package methods;

public class replaceReplit {
    String star(String word,char letter){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==letter){
             word=word.replaceAll(String.valueOf(word.charAt(i)), "*");
            }
    }
    return word;
}
    public static void main(String[]args){
        replaceReplit res=new replaceReplit();
        System.out.println(res.star("computer science",'e'));
    }
}
