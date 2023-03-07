package classObject;

public class stringDemo {
    public static void main(String[] args) {
       String str=new String("java");
        //or often by another way :
        String str1="java ";
        System.out.println(str1.length());
        String str2="banana ";
        int len=str2.length();
        System.out.println(len);

        String name="Rami";
        if (name.length()>10){
            System.out.println("name can't be more tham 10 letters");

            String s1="hello how are you";
            System.out.println(s1.endsWith("u"));

}
    }
}
