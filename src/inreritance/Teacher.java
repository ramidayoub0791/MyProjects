package inreritance;

public class Teacher {
    String name="prof";
    int age=180;
    void setName(){

    }

    void setAge(){

    }
    void prf(){
        System.out.println("He is a good teacher");
    }

    void lastName(){
        System.out.println("what is his last name?");
    }
}

class MathTeacher extends Teacher{
    String good;
    void math(){
        super.setName();
        System.out.println(super.name);
    }
}

class ChemistryTeacher extends Teacher{
  void chem(){
      System.out.println(super.age);
      super.lastName();

  }
}

class PianoTeacher extends Teacher{
    void piano(){
        super.prf();
        super.setAge();
        System.out.println(super.age);
    }

    public static void main(String[] args) {
        PianoTeacher pt=new PianoTeacher();
        pt.piano();
        pt.prf();

        ChemistryTeacher ct=new ChemistryTeacher();
        ct.chem();
        ct.setName();

        MathTeacher mt=new MathTeacher();
        mt.math();
        mt.lastName();
    }
}
/*Write a Java program called Teacher.  Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher,
 ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
 */