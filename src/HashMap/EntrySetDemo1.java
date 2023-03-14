package HashMap;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo1 {
    public static void main(String[] args) {
        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Banana",7.5);
        fruitMap.put("Apple",12.0);
        fruitMap.put("Orange",14.2);
        fruitMap.put("Carrot",5.4);
        fruitMap.put("Cucumber",10.0);
        fruitMap.put("Mango",6.4);

        fruitMap.forEach((x,y)-> System.out.println(x+" "+y));
        System.out.println("**************");
        System.out.println(fruitMap);
        System.out.println("**************");

        fruitMap.entrySet().removeIf(x->(x.getKey().contains("a")||x.getKey().contains("e"))&&x.getValue()>8);
         //   if ((entry.getKey().contains("a")||entry.getKey().contains("e"))&&entry.getValue()>8){
                System.out.println(fruitMap.entrySet());
                // OR :
                System.out.println(fruitMap);
            }
        }


