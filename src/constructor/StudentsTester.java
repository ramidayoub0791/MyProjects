package constructor;

public class StudentsTester {
    public static void main(String[] args) {
        Students student1=new Students("John",66,71.5,82);
        Students student2=new Students("Eric",70.5,85,76);
        Students student3=new Students("Mike",54,69,64);
        Students student4=new Students("Mich",91,77.5,50);
        Students student5=new Students("Brad",68.5,60,65);

        student1.summery();
        student2.summery();
        student3.summery();
        student4.summery();
        student5.summery();



    }
}
