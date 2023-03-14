package Exception;

public class HW3 {
        public static void checkAgeEligibility(int age) {
            if (age < 16) {
                throw new RuntimeException("Age is less than 16, not eligible.");
            }
        }

        public static void main(String[] args) {
            try {
                checkAgeEligibility(18); // eligible
                System.out.println("Age is eligible.");
                checkAgeEligibility(14); // not eligible
                System.out.println("Age is eligible."); // this line won't be executed
            } catch (RuntimeException e) {
                System.out.println("Age is not eligible. Reason: " + e.getMessage());
            }
        }
    }


/* 3) Create a method to check age eligibility that will throw a runtime exception.
 Method should throw an exception age is less than 16.*/
