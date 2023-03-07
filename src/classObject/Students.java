package classObject;

public class Students {
    String name;
    String Id;
   static int numberOfStudent;

    public static void main(String[] args) {
    Students student=new Students();
    student.name="Rami";
    student.Id="123";
    student.numberOfStudent++;

        Students student1=new Students();
        student1.name="Taim";
        student1.Id="456";
        student1.numberOfStudent++;

        Students student2=new Students();
        student2.name="Jado";
        student2.Id="789";
        student2.numberOfStudent++;


        System.out.println(student.numberOfStudent);
        //OR:
        System.out.println(Students.numberOfStudent);




    }
}
//Create a Class called Students
//Create three  variables  Name , ID  and  numberOfStudents
//Create three objects of the Students Class
//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//Print out  total number of students

