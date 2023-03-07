package myHomeWorkss;

public class nestedLoop2 {
   /* public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            for (int j=0;j<=5;j++)
                System.out.print(j*i+" ");
            System.out.println();
        }
      public class ArraysConcept {*/

            public static void main(String[] args) {
                int[] a = {12, 15, 11, 13, 9, 25};
                int[] a2 = {12, 15, 11, 13, 9, 25};
                int sum = 0;
                for (int i = 0; i <a.length; i++) {
                    if (a[i] % 2== a2[i ] % 5)  {
                        sum += i * i;
                    }
                }
                System.out.println("sum = " + sum);
            }

        }
  //  }
//}

