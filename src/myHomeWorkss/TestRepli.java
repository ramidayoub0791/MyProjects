package myHomeWorkss;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;

public class TestRepli {
    public static void main(String[] args) {

        List<Map<String, Object>> dataList = new ArrayList<>();

        Map<String, Object> apple = new HashMap<>();
        apple.put("Items", "Apple");
        apple.put("Price", 20.00);
        apple.put("Quantity", 10);
        dataList.add(apple);

        Map<String, Object> orange = new HashMap<>();
        apple.put("Items", "Orange");
        apple.put("Price", 21.99);
        apple.put("Quantity", 10);
        dataList.add(orange);

        for (Map<String, Object> input : dataList) {

            String items = (String) input.get("Items");
            Double price = (Double) input.get("Price");
            Double quantity = (Double) input.get("Quantity");

            Double subtotal = price * quantity;

            System.out.println(dataList);
            System.out.printf(items+" "+price+" "+quantity+" "+subtotal);

        }
    }
}
/* Map and List (Follow Steps Carefully)
Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList.
Step 2: Create appleMap<String, Object> and add below pairs into it.
"Items", "Apple"
"Price", 20.00
"Quantity", 10
Step 3: Add appleMap to dataList.
Step 4: Create orangeMap<String, Object> and add below pairs into it.
"Items", "Orange"
"Price", 21.99
"Quantity", 10
Step 5: Add orangeMap to dataList.
Step 6: Create a loop from dataList.
Step 7: Retrieve each Key and store is in a variable.
Step 8: calculate the subtotal of each object.
Step 9: Print the values of each Iteration same as shown below in Output example.
Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase.
Step 11: After Loop Print the value of Total Purchase.
**NOTE: as the values are Object you have to do casting properly while retrieving from for each map.**
Output:
Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998
Your Purchase total : 419.9 */