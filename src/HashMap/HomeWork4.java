package HashMap;

import java.util.ArrayList;
import java.util.List;

public class HomeWork4 {
    public static void main(String[] args) {
        List<Integer>nums=new ArrayList<>();
        nums.add(45);
        nums.add(4);
        nums.add(45);
        nums.add(10);
        nums.add(4);
        int sum=0;
        System.out.println(nums);
        for (int i=0;i<nums.size();i++){
            sum= nums.get(i) + sum;
        }
        System.out.println(sum);

    }
}


/*5)Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers */