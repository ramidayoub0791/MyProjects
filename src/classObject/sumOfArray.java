package classObject;

public class sumOfArray {
       int arrSum(int[]arr){
           int sum=0;
           for(int i = 0; i<arr.length;i++){
             sum+=arr[i];
           }
           return sum;
       }
       int sumArr(int[]arra){
           int sum=0;
           for (int array:arra){
               sum+=array;
           }
           return sum;
       }
    }


