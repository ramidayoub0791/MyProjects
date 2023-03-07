package classObject;

public class HelloBonjour {
    String welcome(String language){

      switch (language){
          case("English"):
              return "Hello";
              //no need for break; with return
        //   System.out.println("Hello");break;


          case("French"):
              return "Bonjour";
            /*

              System.out.println("Bonjour");break;
            */

          case("German"):
              return "hallo";
           /*
             System.out.println("hallo");break;*/

          case("Spanish"):
              return "Hola";
           /*
             System.out.println("Hola");break;*/
          default:
              return "language is not supported";
            //  System.out.println("language is not supported");
        }
    }
}
