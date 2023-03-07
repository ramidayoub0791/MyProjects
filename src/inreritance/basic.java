package inreritance;

public class basic {
    int age=3000;

    void salu() {
        System.out.println("Hello");
    }
}

    class grandPa extends basic {
        String name="Timo";
        void parent() {
        System.out.println("Marhaba");
        super.salu();
            System.out.println(super.age);
    }
}

    class father extends grandPa{
    void prin(){

        System.out.println("my name is Rami ");
        super.parent();
        super.salu();
        System.out.println(super.name);
    }

        public static void main(String[] args) {
            father fath=new father();
            fath.prin();
            grandPa gra=new grandPa();
            gra.parent();
            gra.salu();
        }
}


/* HW: Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.*/

