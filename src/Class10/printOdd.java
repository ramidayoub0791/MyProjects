package Class10;

public class printOdd {
    public static void main(String[] args) {
        int[] nums = {10, 13, 20, 25, 45, 50};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[i] = 0;
            }
        }
        System.out.println("after replacing odd numbers wiy zero ");
        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);
        }
    }
}


