package classObject;

public class carTeter {
    public static void main(String[] args) {

        basic bmw = new basic();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="gray";
        bmw.moveForward();
        bmw.applyBrake();

        basic Audi=new basic();
        Audi.year=2022;
        Audi.model="E-tron";
        Audi.make="Audi";
        Audi.color="black";
        Audi.applyBrake();
        Audi.moveForward();
    }
}
