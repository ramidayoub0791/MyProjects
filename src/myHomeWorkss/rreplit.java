package myHomeWorkss;

public class rreplit {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
      // mystery(a){
      int b=0;
            for (int i=0;i<a.length;i++) {
                if (a[i] % 2 == 0) {
                 b = a [i]/ 2;
                } else {
                  b = a[i] * 10;
                }

                System.out.print(b+" ");
            }
        }
    }


