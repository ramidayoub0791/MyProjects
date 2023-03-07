package HashMap;

import java.util.Set;
        import java.util.LinkedHashSet;
public class replit1 {
    public static void main(String[] args) {
        Set<String>names=new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");

        for (String name:names){
            System.out.println(name);
        }

        var calls=names.iterator();
        while (calls.hasNext()){
            System.out.println(calls.next());
        }

    }
}