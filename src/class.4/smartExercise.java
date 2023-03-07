package myHomeWorkss;

public class smartExercise {
    public static void main(String[] args) {
        int num=1;
        int sum=0;

        while (num<=10){
            sum=sum+num;
            num++;
            System.out.println(sum);// print all steps
        }
        System.out.println("**************");
        System.out.println(sum); // print the final result
    }
}
