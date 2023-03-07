package homeWorks;

import java.util.Arrays;

public class taskk {
    public static void main(String[] args) {
        /*   2) Create 2D array of cars : american, german, korean, italian.
        Then retrieve all values from that array using 2 different loops*/
        String[][] cars = {{"Chevrolet", "Ford", "Dodge", "Chrysler"}
                , {"Mercedes", "Opel", "Audi", "BMW", "Volkswagen"}
                , {"Hundai", "Kia", "Daewoo"}
                , {"Ferrari", "Maserati", "Fiat", "Alfa Romeo"}};
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("****************");
        //or by anoyher way we can print them :
        for (String[] brand : cars) {
            for (String x : brand) {
                System.out.print(x + " ");
            }
            System.out.println();

        }
        //or line by line
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("The American cars are : " + Arrays.toString(cars[0]));
        System.out.println("The German cars are : " + Arrays.toString(cars[1]));
        System.out.println("The Korean cars are : " + Arrays.toString(cars[2]));
        System.out.println("The Italian cars are : " + Arrays.toString(cars[3]));
    }
}
