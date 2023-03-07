package HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HomeWorkTest1 {
    public static void main(String[] args) {
        Map<Integer, HomeWork1.Person> personMap = new TreeMap<>();
        personMap.put(101, new HomeWork1.Person("John", "smith", 30, 30000));
        personMap.put(645, new HomeWork1.Person("Keven", "Mico", 28, 45000));
        personMap.put(877, new HomeWork1.Person("Mark", "Paleen", 42, 42000));
        personMap.put(310, new HomeWork1.Person("Robert", "Jackson", 25, 100000));
        //   System.out.println(personMap);

      /*  for (Map.Entry<Integer, HomeWork1.Person> entry : personMap.entrySet()) {
            int id = entry.getKey();
            HomeWork1.Person person = entry.getValue();
            System.out.println("Person " + id + " Details:");
            person.print();*/

        // OR :
        /*    var entrySet = personMap.entrySet();

            for (var entry:entrySet) {
                HomeWork1.Person person = entry.getValue();
                System.out.println(entry.getKey()+" : ");
             //   entry.getValue().print();
                person.print();
            }*/
        //OR :
           var iterator = personMap.entrySet().iterator();
            while (iterator.hasNext()) {
                var entry=iterator.next();
                System.out.println(entry.getKey()+" : ");
              entry.getValue().print();
            }

        }
    }
//}
