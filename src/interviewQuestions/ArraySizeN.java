package interviewQuestions;

import java.util.Arrays;

public class ArraySizeN {
    public static int[] ArraySumToZero(int n) {
        int[] arr = new int[n];
        if (n % 2 == 1) {
            // If n is odd, set the middle element to 0
            arr[n/2] = 0;
        }
        // Fill the array with pairs of positive and negative numbers that sum to 0
        for (int i = 0; i < n/2; i++) {
            arr[i] = i+1;
            arr[n-1-i] = -1*(i+1);
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArraySumToZero(0)));   // []
        System.out.println(Arrays.toString(ArraySumToZero(1)));   // [0]
        System.out.println(Arrays.toString(ArraySumToZero(2)));   // [-1, 1]
        System.out.println(Arrays.toString(ArraySumToZero(3)));   // [1, -1, 0]
        System.out.println(Arrays.toString(ArraySumToZero(4)));   // [1, -1, 2, -2]
        System.out.println(Arrays.toString(ArraySumToZero(5)));   // [-2, -1, 0, 1, 2]

    }
}
