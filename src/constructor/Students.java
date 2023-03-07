package constructor;

public class Students {
    String name;
    double mathGrade;
    double sienceGrade;
    double langGrade;

    Students(String sName,double grade1,double grade2,double grade3){
        name=sName;
      mathGrade=grade1;
      sienceGrade=grade2;
      langGrade=grade3;

        }

  //  double average(){
  //   return  ((mathGrade+sienceGrade+langGrade)/3);
   // }

    void summery(){
        System.out.println(name+" "+(mathGrade+sienceGrade+langGrade)/3);
    }
}
/*  2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
 Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.*/
