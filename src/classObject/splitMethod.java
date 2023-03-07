package classObject;

public class splitMethod {
    public static void main(String[] args) {
        String str="I love java. I have to learn it! So let's go ahead, Is it ok?LOL";
       String[]strArr=str.split("[?.,!]");
       System.out.println(strArr.length);
       //or by another way:
       // System.out.println(str.split("[?.,!]").length);
        System.out.println(strArr[3]);
    }
}
