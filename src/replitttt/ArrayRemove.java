package replitttt;
import java.util.ArrayList;
public class ArrayRemove {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        System.out.println(countries);
        countries.remove(0);
        countries.remove(1);
        countries.remove(2);

        for(String word:countries){
            System.out.print(word+" ");
        }

        for(int i=0;i<countries.size();i++){
            if(countries.get(i).startsWith("A")){
                countries.remove(i);

           }
        }
        System.out.println(countries);
        countries.removeAll(countries);
        System.out.println(countries);
    }
}