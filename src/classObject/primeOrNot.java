package classObject;

public class primeOrNot {
    boolean prime(int x) {
        boolean flag=true;
        if (x > 1) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    flag = false;
                    break;
                   }
                 }
                } else {
                    flag=false;
                }

        return flag;
              }
            }




