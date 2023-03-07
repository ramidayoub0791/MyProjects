package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HomeWork {
    public static void main(String[] args) {
        Map<Integer,String>item=new HashMap<>();
        item.put(964,"PC");
        item.put(102,"TV");
        item.put(512,"printer");
        item.put(614,"phone");
        item.put(783,"DVD");

     /*   var entrySet=item.entrySet();
        for (var it:entrySet){
            System.out.println(it.getKey()+" ...."+it.getValue());*/
// OR :
            var iterator=item.entrySet().iterator();
            while (iterator.hasNext()){
                var entry=iterator.next();
                System.out.println(entry.getKey()+"*****"+entry.getValue());
            }

            // OR:
     /*   for (Map.Entry<Integer, String> entry : item.entrySet()) {
            System.out.println(entry.getKey() + "*****" + entry.getValue());
        }*/
        }
    }

/*1) Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/


