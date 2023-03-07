package myHomeWorkss;

public class trial {

    void subtraction(int i,int j){
        System.out.println("40 (should come from subtracting 4 numbers)");
    }

    void subtraction(int i,int j,int x){
        System.out.println("30 (should come from subtracting 3 numbers)");
    }

    void subtraction(int i,int j,int x,int y){
        System.out.println("20 (should come from subtracting 2 numbers)");
    }

}

class show{
    public static void main(String[] args){
        trial x=new trial();
        x.subtraction(2,3);
        x.subtraction(2,3,4);
        x.subtraction(2,3,5,6);

    }
}