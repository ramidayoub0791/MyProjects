package replitttt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repl_209 {
    public static Double TotalPurchase=0.0;
    public static void main(String[] args) {
        List<Map<String,Object>> dataList=new ArrayList<>();
        //2
        Map<String,Object> appleMap=new HashMap<>();
        appleMap.put("Item","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10);
        //3
        dataList.add(appleMap);
        //4
        Map<String,Object> orangeMap=new HashMap<>();
        orangeMap.put("Item", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);
        dataList.add(orangeMap);
        for (Map<String, Object>  k:dataList){
            String item= (String) k.get("Item");
            Double price1= (Double) k.get("Price");
            Integer quantity1= (Integer) k.get("Quantity");
            Double total=price1*quantity1;
            //Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
            if(k.get("Item")=="Apple") {
                System.out.println("Item: Apple Price: "+price1+" Quantity: "+quantity1+" SubTotal: "+total);
                TotalPurchase+=total;
            }
            else if(k.get("Item")=="Orange") {
                System.out.println("Item: Orange Price: "+price1+" Quantity: "+quantity1+" SubTotal: "+total);
                TotalPurchase+=total;
            }
            System.out.println();
        }
        /*
         * Double TotalPurchase=0.0; for (Map<String, Object> F:dataList){ String item=
         * (String) F.get("Items"); Double price= (Double) F.get("Price"); Integer
         * quantity= (Integer) F.get("Quantity"); Double total=price+quantity;
         * TotalPurchase+=total; //Items: Orange Price: 21.99 Quantity: 10.0 SubTotal:
         * 219.89999999999998
         * System.out.println("Item: Orange Price: "+price+" Quantity: "
         * +quantity+" SubTotal: "+total); }
         */
        System.out.println("Your Purchase total :"+TotalPurchase);
    }
}
