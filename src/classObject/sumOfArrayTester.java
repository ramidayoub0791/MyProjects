package classObject;

public class sumOfArrayTester {
    public static void main(String[] args) {
        sumOfArray total=new sumOfArray();
        int[]jado={2,2,2,2,2};
        System.out.println(total.arrSum(jado));
        System.out.println(total.arrSum(new int[]{10,20,30,40,50}));

     //  int[] rami={1,2,3,4,5};
       int taim=total.sumArr(new int[]{1,2,3,4,5});
        System.out.println(taim);

    }
}
