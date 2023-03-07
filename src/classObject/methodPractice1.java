package classObject;

public class methodPractice1 {
    String reverse(String x) {
        String y = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            y += x.charAt(i);
        }
        return y;
    }

    //OR:
    String reverseStr(String iput) {
        return new StringBuilder(iput).reverse().toString();

    }

    //OR:
    String reverseStr1(String inp) {
        StringBuilder reve = new StringBuilder(inp);
        reve.reverse();
        return reve.toString();
    }
}