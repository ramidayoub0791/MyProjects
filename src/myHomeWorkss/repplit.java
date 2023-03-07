package myHomeWorkss;

public class repplit {
    static int countVowels(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||s.charAt(i) =='e'|| s.charAt(i)=='u'
                   ||s.charAt(i)=='i' ||s.charAt(i)=='o')
                sum = sum+1;
        }
        return sum;
    }

        //test case below (dont change):
        public static void main (String[]args){
            System.out.println(countVowels("obama")); //3
            System.out.println(countVowels("happy friday! i love weekends")); //9
        }
    }


