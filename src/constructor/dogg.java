package constructor;

public class dogg {
    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";

    void dis() {
        System.out.println(dogName + " " + dogBreed + " " + dogWeight);
    }

    dogg(String dogName, String dogBreed, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
        this.dis();
    }

}

 class Main{
public static void main(String[]args){
        dogg d=new dogg("Tarzan", dogg.dogBreed,50.0);// because dogBread if static
        dogg d1=new dogg("Lucy",dogg.dogBreed,10.0);


        }
        }

