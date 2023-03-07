package methods;

public class methodDemo {
    public static void main(String[] args) {
        int[]arr1={10,20,30,40,50};
        addArray(arr1);
        addArray(new int[]{1, 2, 3, 4, 5});
        int[]rami={25,15,5,35,60};
        addArray(rami);
    }
    static void addArray(int[]arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);
    }

}
