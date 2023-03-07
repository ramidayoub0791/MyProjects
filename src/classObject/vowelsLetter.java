package classObject;

public class vowelsLetter {
    private String vowels(String word) {
        String reverse=word.replaceAll("[^aeiou]","");
        return reverse;
    }

    public static void main(String[] args) {
        vowelsLetter vol=new vowelsLetter();
        System.out.println(vol.vowels("vowel"));
    }
}

