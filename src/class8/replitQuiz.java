package class8;

    import java.util.Scanner;

    class Main {
        public static void main(String[] args) {
           Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String givenString = inp.nextLine();
            //write your code below
            boolean palindrome=true;
            givenString=givenString.replace(" ","");
          //  StringBuilder pal=new StringBuilder(givenString);

            String rev= String.valueOf(new StringBuilder(givenString).reverse());

            if (rev.equalsIgnoreCase(givenString)) {
                System.out.print(palindrome);
            }
            else{
                palindrome=false;
                System.out.print(palindrome);
            }
        }
    }

