package interviewQuestions;

import java.util.List;

public class DuplicatedNumbers {
    static int temp = 0;
    public static void duplicate(int numbers[]) {
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 1; j < (numbers.length - i); ++j) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        // walk through the sorted array and count duplicates
        int numDup = 0, dupCount = 0;
        int previous = -1;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == previous) {
                ++numDup;
                if (numDup == 1) {
                    ++dupCount;
                    if (dupCount == 1) {
                        System.out.print(numbers[i]);
                    } else {
                        System.out.print(", " + numbers[i]);
                    }
                }
            } else {
                previous = numbers[i];
                numDup = 0;
            }
        }

        System.out.println("\nNumber of duplicates values: " + dupCount);
    }

    public static void main(String[] args) {
        DuplicatedNumbers.duplicate(new int[]{12, 12, 13, 45, 78, 7, 7});
        DuplicatedNumbers.duplicate(new int[]{12, 12, 7, 7, 7, 7, 7});
        DuplicatedNumbers.duplicate(new int[]{12, 120, 13, 45, 78, 17, 57});
        DuplicatedNumbers.duplicate(new int[]{12, 12, 13, 45, 78, 67, 87});
    }
}
/* Complete countDuplicates method This method should count how many numbers are appearing more than once
 and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1
*/