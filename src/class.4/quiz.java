package myHomeWorkss;

public class quiz {


        public static void main(String[] args) {
            char array_variable [] = new char[10];
            for (int i = 0; i < 10; ++i) {
                array_variable[i] = 'i';
                System.out.print(array_variable[i] + " ");
            }
            int aray_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

            int sum = 0;

            for (int i = 0; i < 3; ++i) {

                for (int j = 0; j < 3; ++j) {

                    sum = sum + aray_variable[i][j];

                }

            }

            System.out.print(sum / 5);

            int[] array = { 1, 4, 3, 6, 8, 2, 5 };

            int what = array[0];

            for (int index = 0; index < array.length; index++) {

                if (array[index] > what) {

                    what = array[index];

                }

            }

            System.out.println(what);
        }
    }

