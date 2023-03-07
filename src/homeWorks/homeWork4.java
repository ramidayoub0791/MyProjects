package homeWorks;

public class homeWork4 {
    public static void main(String[] args) {

        /*  4) Create a 2D array or integer type where you will store odd and even numbers.
         Develop a program which will identify/print the even numbers only.*/
        int[][] nums = {{6, 3, 2, 7}, {5, 8, 9, 4}};
        System.out.println("The even numbers are :");
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j] % 2 == 0) {
                    System.out.print(nums[i][j]+" ");
                }
            }
        }
    }
}

