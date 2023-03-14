package HashMap;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {
        Map<String,Double>fruitMap=new HashMap<>();
        fruitMap.put("Banana",7.5);
        fruitMap.put("Apple",12.0);
        fruitMap.put("Orange",14.2);
        fruitMap.put("Carrot",5.4);
        fruitMap.put("Cucumber",10.0);
        fruitMap.put("Mango",6.4);

        System.out.println(fruitMap);
        System.out.println("**************");
        var entrySet=fruitMap.entrySet();

        for (var entry:entrySet){
         //   System.out.println(entry);

            if ((entry.getKey().contains("a")||entry.getKey().contains("e"))&&entry.getValue()>8){
                System.out.println(entry);
            }
        }
    }
}
