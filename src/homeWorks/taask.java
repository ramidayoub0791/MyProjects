package homeWorks;

public class taask {
    public static void main(String[] args) {
         /*     Create 2D array of countries: north america countries, south america countries, europe countries,
        asian countries, african countries. Then print all values from that array using 2 different loops and
        calculate how many total countries been stored*/
        String[][] countries={{"USA","Canada","Mexico"}
                              ,{"Brasil","Argentina","Urguay","Bolivia","Beru"}
                             ,{"France","England","Italy","Sweden"}
                              ,{"China","Japan","India"}
                               ,{"Egypt","Cameron","South Africa","Nigiria","Morocco"}};
        for (int i=0;i<countries.length;i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("****************");
        //or by anoyher way we can print them :
        for (String[]pays:countries){
            for (String x:pays){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println("////////////////////////");
        System.out.println("The total countries are :"+(countries[0].length + countries[1].length + countries[2].length
                          +countries[3].length + countries[4].length));
    }
}
