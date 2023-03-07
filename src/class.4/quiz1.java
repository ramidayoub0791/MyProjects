package myHomeWorkss;

public class quiz1 {
  //  public static void main(String args[]) {
       /* int z = 0;
        for (int y = 0; y >= z; y++) {
            System.out.print(y + "~");
            System.out.println(z);
        }*/
      /*  int count = 0;
        while (count++ < 10) {
            System.out.println("Welcome to Java");
        }*/
   /*     for(int i = 0; i <= 5; i++ ) {
            System.out.println("i = " + i );
        }

        System.out.println("i after the loop = " + i );*/
     /*   int z=2, sum=0;

        while(z<9) {

            z++;

            sum=sum+z;

        }

        System.out.print(sum);*/
        public static void main(String[] args) {

            int i = 50;

            int[] a = new int[10];

            System.out.println(a.length);

            a = new int[100];

            System.out.println(a.length);

            a = new int[i];

            System.out.println(a.length);

            int count = 0;
            while (count++ < 10) {
                System.out.println("Welcome to Java");
            }
            int y = 0;
            for (int x = 0; x < 10; ++x) {
                y += 1;
            }
            System.out.println(y);

            for(int l = 0; l <= 5; l++ )
            {
                System.out.println("i = " + l );
            }

            int k=3, tot=0;

            do{

                tot=tot+k;

                k++;

            } while(k<11);

            System.out.print(tot);


            int x=1;

            do{

                x++;

                System.out.print(x);

            }while(x<5);

            System.out.println();
            int z=2, sum=0;

            while(z<9) {

                z++;

                sum=sum+z;

            }

            System.out.print(sum);

            System.out.println();

            int m=2, total=0;

            while(m<6) {

                total=total+m;

                m++;

            }

            System.out.print(total);

        }
    }

