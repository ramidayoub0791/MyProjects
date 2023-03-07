package Hash;

import java.util.*;

public class student {
    public static void main(String[] args) {

       HashMap<String,String> stud=new HashMap<>();
       stud.put("Rami","n01");
       stud.put("Taim","n05");
       stud.put("Jad","n08");
       stud.put("Sawsan","n02");
       stud.put("George","n05");
        System.out.println(stud.get("Taim"));
        System.out.println(stud);

        Iterator<String>itr=stud.values().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
      // OR :
            System.out.println("------------------------------");
            Collection<String>value=stud.values();
            for (String val:value){
                System.out.println(val);
            }
        }
    }
}

/*Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion order.
 Each student object should have name and studentID. Display name of each student.
 */