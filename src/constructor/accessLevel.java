package constructor;

public class accessLevel {
    String country;
    int population;
    String capital;
    String continent;

    private accessLevel(String name, int counting) {
        country = name;
        population = counting;

    }


    accessLevel(String name, int counting, String mCity) {
        country = name;
        population = counting;
        capital = mCity;
    }

       protected accessLevel(int counting,String continental){
           population=counting;
           continent=continental;
        }

        public accessLevel(String name,int counting,String mCity,String continental){
            country = name;
            population = counting;
            capital = mCity;
            continent=continental;
    }

    void prining(){
        System.out.println(country+" "+population+" "+capital+" "+continent);
    }

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

/*3) Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
 3 - from different class inside different package  and observe result.*/

