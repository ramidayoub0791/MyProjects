package Class10;

public class ArrayNew {
    public static void main(String[] args) {
        int[][] nums={{10,20,30,40,50},
                {5,15,20,3,9,5,7},
                {2,4,6,8,10}};
        for(int[] num:nums){
            for (int numbers:num)
            System.out.print(numbers+" ");
            System.out.println();
        }

    }
}
