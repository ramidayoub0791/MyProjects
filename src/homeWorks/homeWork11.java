package homeWorks;

public class homeWork11 {
    public static void main(String[] args) {
     /*   11)Write a program to print out duplicate elements from an Array of Strings?*/
        String[] dup={"dog","cat","frog","elefant","cat","lion","fox","mouse","dog"};
        for (int i=0;i<dup.length;i++){
            for (int j=i+1;j<dup.length;j++){
            if (dup[j].equals(dup[i])) {
                System.out.println(dup[j]);

              }
            }
        }
    }
}
