package HashMap;

import java.util.Map;
import java.util.TreeMap;

public class HomeWork2 {
    public static void main(String[] args) {
        Map<String,Integer>employee=new TreeMap<>();
        employee.put("John Smith",100000);
        employee.put("jjjj",90000);
        employee.put("hhhhh",98000);
        employee.put("aaaa",68000);
        employee.put("bbbbbb",80000);
        String highestPaidEmployee =null;
        int highestSalary = 0;
      //  for (Map.Entry<String, Integer> entry : employee.entrySet()) {
        var entry=employee.entrySet();
        for (var ent:entry){
            if (ent.getValue() > highestSalary) {
                highestSalary = ent.getValue();
                highestPaidEmployee = ent.getKey();
            }
        }

        // print the employee with the highest salary
        System.out.println(highestPaidEmployee + "=$" + highestSalary);

    }
}

/*3)Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
 Output should be in the below format
John Smith=$100000*/
