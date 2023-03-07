package classObject;

import static java.lang.System.*;

public class stringBuilder {
    public static void main(String[] args) {
        out.println( new StringBuilder("Sunday").reverse());

        //or
        StringBuilder A=new StringBuilder("Friday");
     //  A.reverse();
        out.println(A.reverse());
        out.println(A.reverse());
        out.println(A.replace(0,3,"Satur"));
        out.println(A.append(" is weekend"));

    }
}
