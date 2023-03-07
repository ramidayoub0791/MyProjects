package homeWorks;

public class arrayPractice {
    public static void main(String[] args) {
      /* 1) Create an array of chars and store grades into it: A,B,C,D,E,F.
      Then print a grade B (use 2 different ways of creating an array).*/
       char[]grade={'A','B','C','D','E','F'};
        System.out.println(grade[0]);
        System.out.println(grade[1]);

        char[]grade1=new char[6];
        grade1[0]='A';
        grade1[1]='B';
        grade1[2]='C';
        grade1[3]='D';
        grade1[4]='E';
        grade1[5]='F';

        System.out.println(grade[0]);
        System.out.println(grade[1]);


    }
}
