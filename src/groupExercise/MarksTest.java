package groupExercise;

public class MarksTest {
    public static void main(String[] args) {
          Marks x=new A();
         Marks y=new B();
          System.out.println("The Percentage of the student A : "+ x.getPercentage(60, 70, 80,90));
          System.out.println("The Percentage of the student B : "+ y.getPercentage(60, 70, 80, 90));
    }
}

