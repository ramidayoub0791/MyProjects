package classObject;

public class replitSolution {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

            for (int i = 0;i<=0 ;i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum += a[0][j];
                sum1 +=a[1][j];
                sum2 +=a[2][j];
                sum3 +=a[3][j];
            }
        }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}

