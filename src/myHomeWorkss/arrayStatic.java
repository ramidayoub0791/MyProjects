package myHomeWorkss;

public class arrayStatic {

   static int sum2D(){
        int[][]arr={{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
        }
       return sum;
   }
}

class Mmain extends arrayStatic {
    public static void main(String[] args) {
          System.out.println(sum2D());
    }
}