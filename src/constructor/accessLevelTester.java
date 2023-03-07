package constructor;

public class accessLevelTester {
    public static void main(String[] args) {
        accessLevel usa=new accessLevel("usa", 300, "America");
        accessLevel canada=new accessLevel("canada", 34, "Ottawa");
        accessLevel mexique=new accessLevel( 150, "America");
        accessLevel France=new accessLevel("usa", 60, "Paris","Europe");

        usa.prining();
        canada.prining();
        mexique.prining();
        France.prining();
    }
}
