package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        // Create below program without break keyword before 11:16
        boolean summer=true;
        int temp=75;

        while (summer){

            if(temp<=100){
                System.out.println("I love summer because Temperature is "+temp);
            }else {
                System.out.println("Its very hot "+temp);
                break;
            }
            temp+=5;
        }
    }
}
