package groupExercise;

public abstract class Marks {

    abstract double getPercentage(int s1,int s2,int s3,int s4);

}

  class A extends Marks{
double getPercentage(int s1,int s2, int s3,int s4){
    double Average=(s1+s2+s3)/3;
    return Average;
}
 }
 class B extends Marks{

    double getPercentage(int s1, int s2, int s3, int s4){
        double Average=(s1+s2+s3+s4)/4;
        return Average;
    }
}
/* 2. We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code*/
