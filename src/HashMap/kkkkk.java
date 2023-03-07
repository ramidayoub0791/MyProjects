package HashMap;

import java.util.Map;
        import java.util.TreeMap;

public class kkkkk {
    public static void main(String[] args) {
        Map<String,String>fruits=new TreeMap<>();
        fruits.put("1 item","apple");
        fruits.put("2 item","banana");
        fruits.put("3 item","pear");
        fruits.put("4 item","tomato");
        fruits.put("5 item","mango");
        fruits.put("6 item","kiwi");

        var fruit=fruits.entrySet();
        for(var fr :fruit){
            System.out.println(fr.getValue());
        }
    }
}