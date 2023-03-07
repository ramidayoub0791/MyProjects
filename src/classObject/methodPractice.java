package classObject;

public class methodPractice {
  boolean evenNumber(int a){
      boolean even;
     if (a%2==0){
          even=true;
     }else {
         even=false;
     }
     return even;
  }

  //or

    boolean evenNumber1(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
      //or

        boolean evenNumber2(int a){
          return a%2==0;
        }
    }

