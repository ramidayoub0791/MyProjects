package Exception;

import java.io.FileNotFoundException;
public class exceptionDemo2 {

        public static void main(String[] args) throws FileNotFoundException, LazyException {


            //String path=null;
            //FileInputStream fileInputStream=new FileInputStream(path);

            String name="abeera";

            if(name.length()<8){
                throw new LazyException("Lazy person found");
            }

        }
    }

