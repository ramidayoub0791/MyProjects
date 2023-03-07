package classObject;

public class replace {
    public static void main(String[] args) {

               String mix="3213Hello 89 World354545 *&***^&*^&*";
                System.out.println(mix.replaceAll("[0-9]", ""));
                System.out.println(mix.replaceAll("[a-z]", ""));
                System.out.println(mix.replaceAll("[a-z A-Z]", ""));
                System.out.println(mix.replaceAll("[^A-Za-z0-9]", ""));

        String word ="abrakadabra";
        String replace=word.replaceAll("[^aAeEiIoOuU]", "");
        System.out.println(replace);

        String str_Sample = "RockStar";
        System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));

        double[][] taim={{4.0,1.5,1.6},{6.1,1.0,3.1,1,2}};
        for (double[] doubles : taim) {
            for (int j = 0; j < doubles.length; j++) {
            }
        }
        System.out.print(taim[0][0] + " " + taim[0][1] + " "+ taim[1][0] + " " + taim[1][1]);
    }
}

