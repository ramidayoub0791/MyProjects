package HashMap;


import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


public class replit {

    public static void main(String[] args) {
        // Step 1
        List<Map<String, Object>> dataList = new ArrayList<>();

        // Step 2
        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        // Step 3
        dataList.add(appleMap);

        // Step 4
        Map<String, Object> orangeMap = new HashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        // Step 5
        dataList.add(orangeMap);

        // Step 6
        for (Map<String, Object> map : dataList) {
            // Step 7
            String items = (String) map.get("Items");
            Double price = (Double) map.get("Price");
            Double quantity = (Double) map.get("Quantity");

            // Step 8
            Double subtotal = price * quantity;

            // Step 9
            System.out.printf("Items: %s Price: %.2f Quantity: %.1f SubTotal: %.2f\n" +
                    items + " " + price + " " + " " + quantity + " " + subtotal);
        }

        // Step 10
        Double totalPurchase = dataList.stream()
                .mapToDouble(map -> (Double) map.get("Price") * (Double) map.get("Quantity"))
                .sum();

        // Step 11
        System.out.printf("Your Purchase total : %.1f" + totalPurchase);
    }
}
/*# Map and List (Follow Steps Carefully)

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

Your Purchase total : 419.9*/
