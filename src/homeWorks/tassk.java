package homeWorks;

public class tassk {
    public static void main(String[] args) {
        /*  Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.*/
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum=0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + " ");
                sum+=ints[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("the sum of all numbers is :"+sum);
    }
}
