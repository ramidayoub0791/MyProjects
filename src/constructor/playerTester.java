package constructor;

public class playerTester {
    public static void main(String[] args) {
        plyer Messi=new plyer("Messi",34,'L');
        plyer Ronaldo=new plyer("Ronaldo",37,'R');
        plyer Mpabi=new plyer("Mpabi",23,'R');


        Messi.printing();
        Ronaldo.printing();
        Mpabi.printing();

        plyer Kane=new plyer();
        Kane.preferredFoot='R';
        Kane.age=30;
        Kane.name="Kane";

        Kane.printing();
    }
}
