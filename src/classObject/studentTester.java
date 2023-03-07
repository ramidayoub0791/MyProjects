package classObject;

public class studentTester {
    public static void main(String[] args) {
        student stud=new student();
        stud.name="Rami";
        stud.id="123";
        stud.schoolName="syntax";
        stud.age=22;
        stud.weight=70;

        student stud1=new student();
        stud1.name="Taim";
        stud1.id="456";
    //    stud1.schoolName="syntax";
        stud1.age=17;
        stud1.weight=86;

        student stud2=new student();
        stud2.name="Jado";
        stud2.id="789";
    //    stud2.schoolName="syntax";
        stud2.age=10;
        stud2.weight=60;

        System.out.println(stud2.schoolName);//because it is static variable
        //OR by name of class :
        System.out.println(student.schoolName);
    }
}
