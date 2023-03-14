package Exception;

import java.util.ArrayList;
import java.util.List;
public class HW2 {
        public static List<Exception> createExceptionList() {
            List<Exception> exceptions = new ArrayList<>();
            try {// Divide by zero exception
                 int a = 1 / 0;
            } catch (ArithmeticException e) {
             //   System.out.println("Hellooooo");
                 exceptions.add(e);
            }

            try {
                // Index out of bounds exception
                int[] arr = {1, 2, 3};
                int i = arr[3];
            } catch (IndexOutOfBoundsException e) {
                exceptions.add(e);
            }

            try {
                // Null pointer exception
                String str = null;
                int len = str.length();
            } catch (NullPointerException e) {
                exceptions.add(e);
            }

            try {
                // Class cast exception
                Object obj = "abc";
                Integer num = (Integer) obj;
            } catch (ClassCastException e) {
                exceptions.add(e);
            }

            return exceptions;
        }

        public static void main(String[] args) {
            List<Exception> exceptions = createExceptionList();
            for (Exception e : exceptions) {
                System.out.println("Exception type: " + e.getClass().getName());
             //   System.out.println("Exception type: " + "Ramiiiii");
               System.out.println("Exception details: " + e.getMessage());
              //  System.out.println("Exception details: " + "Dayoub");
                System.out.println("----------------------");
            }
        }
    }



/*2) Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.*/

