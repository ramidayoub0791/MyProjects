package methods;

public class sunEven {


        String adSpace(String s){
                String d="";
            for(int i = 0; s.length() >i; i++) {
                d += s.charAt(i) + " ";
            }
            return d;
        }
        public static void main(String[]args){
            sunEven word=new sunEven();
            System.out.println(word.adSpace("hello"));
        }
    }

