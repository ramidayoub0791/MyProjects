package myHomeWorkss;

public class word {

   static String maxLength(String[]arr){
        String max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>arr[0].length())
                max=arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}

