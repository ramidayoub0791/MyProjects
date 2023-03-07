package myHomeWorkss;

public class IfElseIfConditionDemo3 {
    public static void main(String[] args) {


        int number=-13;
        if(number>0){
            System.out.println("POSITIVE");
        }else if(number<0){
            System.out.println("NEGATIVE");
        }else if(number==0){
            System.out.println("ZERO");
        }



        String carMaker="Toyota";

        if(carMaker.equals("Toyota")){
            System.out.println(" We build reliable cars");
        } else if (carMaker.equals("Tesla")) {
            System.out.println("we build Electric cars");
        }else if (carMaker.equals("Ferrari")){
            System.out.println("we build Racing cars");
        }else if(carMaker.equals("Bugatti")){
            System.out.println("We build expensive cars");
        }


        int day=1; //Assign a value to a variable

        if(day==1){ // we compare two values
            System.out.println("Monday");  // If Block
        }else if(day==2) {
            System.out.println("Tuesday"); // else block
        }else if (day==3){
            System.out.println("Wednesday");
        } else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        } else if(day==7){
            System.out.println("Sunday");
        }else {
            System.out.println("Please enter a day between 1 and 7");
        }
    }
}
