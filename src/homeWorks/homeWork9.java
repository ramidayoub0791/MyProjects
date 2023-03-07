package homeWorks;

public class homeWork9 {
    public static void main(String[] args) {
/* 9)Maximum and minimum number in the array? */
        int[] ints= {2,15,30,7,1,45,78,101,23};
        int max=ints[0];
        for (int i=0;i<ints.length;i++){
         if (ints[i]>max){
            max= ints[i];
          }
        }
        System.out.println("the maximum number is :"+max);
        int min=ints[0];
        for (int i=0;i<ints.length;i++){
            if (ints[i]<min){
                min= ints[i];
            }}
        System.out.println("the minimum number is :"+min);
    }}



